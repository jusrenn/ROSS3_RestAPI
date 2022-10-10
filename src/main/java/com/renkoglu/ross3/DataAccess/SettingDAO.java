package com.renkoglu.ross3.DataAccess;

import com.renkoglu.ross3.Entities.Member;
import com.renkoglu.ross3.Entities.Setting;

import java.util.List;

public interface SettingDAO {
    List<Setting> getAll();
    Setting getById(int id);
    void add(Setting setting);
    void update(Setting setting);
    void delete(Setting setting);
}
