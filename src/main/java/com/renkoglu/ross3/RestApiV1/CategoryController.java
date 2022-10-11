package com.renkoglu.ross3.RestApiV1;

import com.renkoglu.ross3.Business.IService;
import com.renkoglu.ross3.Entities.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CategoryController {

    @Autowired
    @Qualifier("categoryManager")
    private IService categoryManager;

    public CategoryController(IService categoryManager) {
        this.categoryManager = categoryManager;
    }

    @GetMapping("/categories")
    public List<Category> categories() {
        return categoryManager.getAll();
    }

    @GetMapping("/categories/{id}")
    public Category getById(@PathVariable int id) {
        return (Category) categoryManager.getById(id);
    }

    @PostMapping("/categories")
    public void add(@RequestBody Category category) {
        categoryManager.add(category);
    }

    @PutMapping("/categories")
    public void update(@RequestBody Category category) {
        categoryManager.update(category);
    }

    @DeleteMapping("/categories")
    public void delete(@RequestBody Category category) {
        categoryManager.delete(category);
    }
}
