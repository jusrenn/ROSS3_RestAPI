package com.renkoglu.ross3.DataAccess;

import com.renkoglu.ross3.Entities.Page;

import java.util.List;

public interface PageDAO {
    List<Page> getAll();
    Page getById(int id);
    void add(Page page);
    void update(Page page);
    void delete(Page page);
}
