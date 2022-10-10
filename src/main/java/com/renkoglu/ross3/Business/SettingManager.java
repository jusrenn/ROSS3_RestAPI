package com.renkoglu.ross3.Business;

import com.renkoglu.ross3.DataAccess.SettingDAO;
import com.renkoglu.ross3.Entities.Setting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SettingManager implements IService<Setting>{

    @Autowired
    private SettingDAO settingDal;

    public SettingManager(SettingDAO settingDal) {
        this.settingDal = settingDal;
    }

    @Override
    @Transactional
    public List<Setting> getAll() {
        return this.settingDal.getAll();
    }

    @Override
    @Transactional
    public Setting getById(int id) {
        return this.settingDal.getById(id);
    }

    @Override
    public void add(Setting setting) {}

    @Override
    public void update(Setting setting) {
        this.settingDal.update(setting);
    }

    @Override
    public void delete(Setting setting) {}
}
