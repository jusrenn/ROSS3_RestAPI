package com.renkoglu.ross3.RestApiV1;

import com.renkoglu.ross3.Business.IService;
import com.renkoglu.ross3.Entities.PostCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class PostCodeController {

    @Autowired
    @Qualifier("postCodeManager")
    private IService postCodeManager;

    public PostCodeController(IService postCodeManager) {
        this.postCodeManager = postCodeManager;
    }

    @GetMapping("/postcodes")
    public List<PostCode> postCode() {
        return postCodeManager.getAll();
    }

    @GetMapping("/postcodes/{id}")
    public PostCode getById(@PathVariable int id) {
        return (PostCode) postCodeManager.getById(id);
    }

    @PostMapping("/postcodes")
    public void add(@RequestBody PostCode postCode) {
        postCodeManager.add(postCode);
    }

    @PutMapping("/postcodes")
    public void update(@RequestBody PostCode postCode) {
        postCodeManager.update(postCode);
    }

    @DeleteMapping("/postcodes")
    public void delete(@RequestBody PostCode postCode) {
        postCodeManager.delete(postCode);
    }
}
