package com.renkoglu.ross3.Business;

import com.renkoglu.ross3.DataAccess.AdminUserDAO;
import com.renkoglu.ross3.Entities.AdminUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AdminUserManager implements IService<AdminUser>{

    @Autowired
    private AdminUserDAO adminUserDAL;

    public AdminUserManager(AdminUserDAO adminUserDAL) {
        this.adminUserDAL = adminUserDAL;
    }

    @Override
    @Transactional
    public List<AdminUser> getAll() {
        return this.adminUserDAL.getAll();
    }

    @Override
    @Transactional
    public AdminUser getById(int id) {
        return this.adminUserDAL.getById(id);
    }

    @Override
    @Transactional
    public void add(AdminUser adminUser) {
        this.adminUserDAL.add(adminUser);
    }

    @Override
    @Transactional
    public void update(AdminUser adminUser) {
        this.adminUserDAL.update(adminUser);
    }

    @Override
    @Transactional
    public void delete(AdminUser adminUser) {
        this.adminUserDAL.delete(adminUser);
    }
}
