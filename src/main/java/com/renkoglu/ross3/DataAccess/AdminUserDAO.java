package com.renkoglu.ross3.DataAccess;

import com.renkoglu.ross3.Entities.AdminUser;

import java.util.List;

public interface AdminUserDAO {
    List<AdminUser> getAll();
    AdminUser getById(int id);
    void add(AdminUser adminUser);
    void update(AdminUser adminUser);
    void delete(AdminUser adminUser);
}
