package com.renkoglu.ross3.RestApiV1;

import com.renkoglu.ross3.Business.IService;
import com.renkoglu.ross3.Entities.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class FoodController {

    @Autowired
    @Qualifier("foodManager")
    private IService foodManager;

    public FoodController(IService foodManager) {
        this.foodManager = foodManager;
    }

    @GetMapping("/foods")
    public List<Food> foods() {
        return foodManager.getAll();
    }

    @GetMapping("/foods/{id}")
    public Food getById(@PathVariable int id) {
        return (Food) foodManager.getById(id);
    }

    @PostMapping("/foods")
    public void add(@RequestBody Food food) {
        foodManager.add(food);
    }

    @PutMapping("/foods")
    public void update(@RequestBody Food food) {
        foodManager.update(food);
    }

    @DeleteMapping("/foods")
    public void delete(@RequestBody Food food) {
        foodManager.delete(food);
    }
}
