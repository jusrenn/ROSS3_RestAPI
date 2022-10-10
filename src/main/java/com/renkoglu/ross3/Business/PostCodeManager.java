package com.renkoglu.ross3.Business;

import com.renkoglu.ross3.DataAccess.PostCodeDAO;
import com.renkoglu.ross3.Entities.PostCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PostCodeManager implements IService<PostCode> {

    @Autowired
    private PostCodeDAO postCodeDal;

    public PostCodeManager(PostCodeDAO postCodeDal) {
        this.postCodeDal = postCodeDal;
    }

    @Override
    @Transactional
    public List<PostCode> getAll() {
        return this.postCodeDal.getAll();
    }

    @Override
    @Transactional
    public PostCode getById(int id) {
        return this.postCodeDal.getById(id);
    }

    @Override
    @Transactional
    public void add(PostCode postCode) {
        this.postCodeDal.add(postCode);
    }

    @Override
    @Transactional
    public void update(PostCode postCode) {
        this.postCodeDal.update(postCode);
    }

    @Override
    @Transactional
    public void delete(PostCode postCode) {
        this.postCodeDal.delete(postCode);
    }
}
