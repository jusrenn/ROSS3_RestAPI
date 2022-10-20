package com.renkoglu.ross3.RestApiV1;

import com.renkoglu.ross3.Business.IService;
import com.renkoglu.ross3.Entities.AdminUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class AdminUserController {

    @Autowired
    @Qualifier("adminUserManager")
    private IService adminUserManager;

    public AdminUserController(IService adminUserManager) {
        this.adminUserManager = adminUserManager;
    }

    @GetMapping("/admins")
    public List<AdminUser> adminUsers() {
        return adminUserManager.getAll();
    }

    @GetMapping("/admins/{id}")
    public AdminUser getById(@PathVariable int id) {
        return (AdminUser) adminUserManager.getById(id);
    }

    @PostMapping("/admins")
    public void add(@RequestBody AdminUser adminUser) {
        adminUserManager.add(adminUser);
    }

    @PutMapping("/admins")
    public void update(@RequestBody AdminUser adminUser) {
        adminUserManager.update(adminUser);
    }

    @DeleteMapping("/admins")
    public void delete(@RequestBody AdminUser adminUser) {
        adminUserManager.delete(adminUser);
    }

}
