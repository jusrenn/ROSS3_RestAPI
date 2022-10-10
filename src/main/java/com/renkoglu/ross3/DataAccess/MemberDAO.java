package com.renkoglu.ross3.DataAccess;

import com.renkoglu.ross3.Entities.Member;

import java.util.List;

public interface MemberDAO {
    List<Member> getAll();
    Member getById(int id);
    void add(Member member);
    void update(Member member);
    void delete(Member member);
}
