package com.renkoglu.ross3.RestApiV1;

import com.renkoglu.ross3.Business.IService;
import com.renkoglu.ross3.Entities.ApiKey;
import com.renkoglu.ross3.Entities.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ApiKeyController {

    @Autowired
    @Qualifier("apiKeyManager")
    private IService apiKeyManager;

    public ApiKeyController(IService apiKeyManager) {
        this.apiKeyManager = apiKeyManager;
    }

    @GetMapping("/apikeys")
    public List<ApiKey> apiKeys() {
        return apiKeyManager.getAll();
    }

    @GetMapping("/apikeys/{id}")
    public ApiKey getById(@PathVariable int id) {
        return (ApiKey) apiKeyManager.getById(id);
    }

    @PostMapping("/apikeys")
    public void add(@RequestBody ApiKey apiKey) {
        apiKeyManager.add(apiKey);
    }

    @PutMapping("/apikeys")
    public void update(@RequestBody ApiKey apiKey) {
        apiKeyManager.update(apiKey);
    }

    @DeleteMapping("/apikeys")
    public void delete(@RequestBody ApiKey apiKey) {
        apiKeyManager.delete(apiKey);
    }
}
