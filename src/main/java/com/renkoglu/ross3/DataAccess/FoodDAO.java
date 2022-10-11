package com.renkoglu.ross3.DataAccess;

import com.renkoglu.ross3.Entities.Food;

import java.util.List;

public interface FoodDAO {
    List<Food> getAll();
    Food getById(int id);
    void add(Food food);
    void update(Food food);
    void delete(Food food);
}
