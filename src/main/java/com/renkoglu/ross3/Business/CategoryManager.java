package com.renkoglu.ross3.Business;

import com.renkoglu.ross3.DataAccess.CategoryDAO;
import com.renkoglu.ross3.Entities.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CategoryManager implements IService<Category> {

    @Autowired
    private CategoryDAO categoryDal;

    public CategoryManager(CategoryDAO categoryDal) {
        this.categoryDal = categoryDal;
    }

    @Override
    @Transactional
    public List<Category> getAll() {
        return this.categoryDal.getAll();
    }

    @Override
    @Transactional
    public Category getById(int id) {
        return this.categoryDal.getById(id);
    }

    @Override
    @Transactional
    public void add(Category category) {
        this.categoryDal.add(category);
    }

    @Override
    @Transactional
    public void update(Category category) {
        this.categoryDal.update(category);
    }

    @Override
    @Transactional
    public void delete(Category category) {
        this.categoryDal.delete(category);
    }
}
