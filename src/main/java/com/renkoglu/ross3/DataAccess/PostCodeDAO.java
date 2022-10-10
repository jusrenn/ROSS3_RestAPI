package com.renkoglu.ross3.DataAccess;

import com.renkoglu.ross3.Entities.PostCode;

import java.util.List;

public interface PostCodeDAO {
    List<PostCode> getAll();
    PostCode getById(int id);
    void add(PostCode postCode);
    void update(PostCode postCode);
    void delete(PostCode postCode);
}
