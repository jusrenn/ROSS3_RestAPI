package com.renkoglu.ross3.DataAccess.Hibernate;

import com.renkoglu.ross3.DataAccess.MemberDAO;
import com.renkoglu.ross3.Entities.Member;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class MemberDAL implements MemberDAO {

    @Autowired
    private EntityManager entityManager;

    public MemberDAL(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Member> getAll() {
        Session session = entityManager.unwrap(Session.class);
        List<Member> members= session.createQuery("from Member", Member.class).getResultList();
        return members;
    }

    @Override
    @Transactional
    public Member getById(int id) {
        Session session = entityManager.unwrap(Session.class);
        Member member = session.get(Member.class, id);
        return member;
    }

    @Override
    @Transactional
    public void add(Member member) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(member);
    }

    @Override
    @Transactional
    public void update(Member member) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(member);
    }

    @Override
    @Transactional
    public void delete(Member member) {
        Session session = entityManager.unwrap(Session.class);
        Member memberToDelete = session.get(Member.class, member.getId());
        session.delete(memberToDelete);
    }
}

