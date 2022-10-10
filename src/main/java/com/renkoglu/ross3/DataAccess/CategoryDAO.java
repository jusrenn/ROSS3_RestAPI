package com.renkoglu.ross3.DataAccess;

import com.renkoglu.ross3.Entities.Category;

import java.util.List;

public interface CategoryDAO {
    List<Category> getAll();
    Category getById(int id);
    void add(Category category);
    void update(Category category);
    void delete(Category category);
}
