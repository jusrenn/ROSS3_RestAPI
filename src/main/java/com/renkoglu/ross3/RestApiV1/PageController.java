package com.renkoglu.ross3.RestApiV1;

import com.renkoglu.ross3.Business.IService;
import com.renkoglu.ross3.Entities.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class PageController {

    @Autowired
    @Qualifier("pageManager")
    private IService pageManager;

    public PageController(IService pageManager) {
        this.pageManager = pageManager;
    }

    @GetMapping("/pages")
    public List<Page> pages() {
        return pageManager.getAll();
    }

    @GetMapping("/pages/{id}")
    public Page getById(@PathVariable int id) {
        return (Page) pageManager.getById(id);
    }

    @PostMapping("/pages")
    public void add(@RequestBody Page page) {
        pageManager.add(page);
    }

    @PutMapping("/pages")
    public void update(@RequestBody Page page) {
        pageManager.update(page);
    }

    @DeleteMapping("/pages")
    public void delete(@RequestBody Page page) {
        pageManager.delete(page);
    }
}
