package com.realdolmen.spring.service;

import com.realdolmen.spring.domain.Animal;
import com.realdolmen.spring.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodDistributionServiceImpl implements FoodDistributionService {

    @Autowired
    private FoodRepository foodRepository;

    @Override
    public void feedAnimalsByType(List<Animal> animals) {
        // For Java 7
        for (Animal animal : animals) {
            animal.feed(foodRepository.findFoodForAnimalType(animal.getClass()));
        }

        // For Java 8
        //animals.stream().forEach(x -> x.feed(foodRepository.findFoodForAnimalType(x.getClass())));
    }
}
