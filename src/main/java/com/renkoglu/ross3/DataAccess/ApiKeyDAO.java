package com.renkoglu.ross3.DataAccess;

import com.renkoglu.ross3.Entities.ApiKey;

import java.util.List;

public interface ApiKeyDAO {
    List<ApiKey> getAll();
    ApiKey getById(int id);
    void add(ApiKey apiKey);
    void update(ApiKey apiKey);
    void delete(ApiKey apiKey);
}
