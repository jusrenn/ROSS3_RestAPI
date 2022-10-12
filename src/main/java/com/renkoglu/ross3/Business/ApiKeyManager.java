package com.renkoglu.ross3.Business;

import com.renkoglu.ross3.DataAccess.ApiKeyDAO;
import com.renkoglu.ross3.Entities.ApiKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApiKeyManager implements IService<ApiKey> {

    @Autowired
    private ApiKeyDAO apiKeyDal;

    public ApiKeyManager(ApiKeyDAO apiKeyDal) {
        this.apiKeyDal = apiKeyDal;
    }

    @Override
    public List<ApiKey> getAll() {
        return this.apiKeyDal.getAll();
    }

    @Override
    public ApiKey getById(int id) {
        return this.apiKeyDal.getById(id);
    }

    @Override
    public void add(ApiKey apiKey) {
        this.apiKeyDal.add(apiKey);
    }

    @Override
    public void update(ApiKey apiKey) {
        this.apiKeyDal.update(apiKey);
    }

    @Override
    public void delete(ApiKey apiKey) {
        this.apiKeyDal.delete(apiKey);
    }
}
