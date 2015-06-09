package com.realdolmen.spring.repository;

import com.realdolmen.spring.domain.Animal;
import com.realdolmen.spring.domain.Food;

import java.util.HashMap;
import java.util.Map;

public class FoodRepositoryImpl implements FoodRepository {
    private Map<Class<? extends Animal>, Food> feed = new HashMap<>();

    @Override
    public void addFoodForAnimalType(Class<? extends Animal> c, Food food) {
        feed.put(c, food);
    }

    @Override
    public Food findFoodForAnimalType(Class<? extends Animal> c) {
        return feed.get(c);
    }
}
