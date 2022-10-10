package com.renkoglu.ross3.RestApiV1;

import com.renkoglu.ross3.Business.IService;
import com.renkoglu.ross3.Entities.Setting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class SettingController {

    @Autowired
    @Qualifier("settingManager")
    private IService settingManager;

    public SettingController(IService settingManager) {
        this.settingManager = settingManager;
    }

    @GetMapping("/settings")
    public List<Setting> settings() {
        return settingManager.getAll();
    }

    @GetMapping("/settings/{id}")
    public Setting getById(@PathVariable int id) {
        return (Setting) settingManager.getById(id);
    }

    @PutMapping("/settings/")
    public void update(@RequestBody Setting setting) {
        settingManager.update(setting);
    }
}
