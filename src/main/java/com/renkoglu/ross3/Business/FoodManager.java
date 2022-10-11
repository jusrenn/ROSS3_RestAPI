package com.renkoglu.ross3.Business;

import com.renkoglu.ross3.DataAccess.FoodDAO;
import com.renkoglu.ross3.Entities.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FoodManager implements IService<Food>{

    @Autowired
    private FoodDAO foodDal;

    public FoodManager(FoodDAO foodDal) {
        this.foodDal = foodDal;
    }

    @Override
    @Transactional
    public List<Food> getAll() {
        return this.foodDal.getAll();
    }

    @Override
    @Transactional
    public Food getById(int id) {
        return this.foodDal.getById(id);
    }

    @Override
    @Transactional
    public void add(Food food) {
        this.foodDal.add(food);
    }

    @Override
    @Transactional
    public void update(Food food) {
        this.foodDal.update(food);
    }

    @Override
    @Transactional
    public void delete(Food food) {
        this.foodDal.delete(food);
    }
}
