package com.renkoglu.ross3.Business;

import com.renkoglu.ross3.DataAccess.PageDAO;
import com.renkoglu.ross3.Entities.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class PageManager implements IService<Page>{

    @Autowired
    private PageDAO pageDal;

    public PageManager(PageDAO pageDal) {
        this.pageDal = pageDal;
    }

    @Override
    @Transactional
    public List<Page> getAll() {
        return this.pageDal.getAll();
    }

    @Override
    @Transactional
    public Page getById(int id) {
        return this.pageDal.getById(id);
    }

    @Override
    @Transactional
    public void add(Page page) {
        this.pageDal.add(page);
    }

    @Override
    @Transactional
    public void update(Page page) {
        this.pageDal.add(page);
    }

    @Override
    @Transactional
    public void delete(Page page) {
        this.pageDal.add(page);
    }
}
