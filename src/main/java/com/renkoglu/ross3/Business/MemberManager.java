package com.renkoglu.ross3.Business;

import com.renkoglu.ross3.DataAccess.MemberDAO;
import com.renkoglu.ross3.Entities.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MemberManager implements IService<Member> {

    @Autowired
    private MemberDAO memberDal;

    public MemberManager(MemberDAO memberDal) {
        this.memberDal = memberDal;
    }

    @Override
    @Transactional
    public List<Member> getAll() {
        return this.memberDal.getAll();
    }

    @Override
    @Transactional
    public Member getById(int id) {
        return this.memberDal.getById(id);
    }

    @Override
    @Transactional
    public void add(Member member) {
        this.memberDal.add(member);
    }

    @Override
    @Transactional
    public void update(Member member) {
        this.memberDal.update(member);
    }

    @Override
    @Transactional
    public void delete(Member member) {
        this.memberDal.delete(member);
    }
}
