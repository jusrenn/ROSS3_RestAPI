package com.renkoglu.ross3.RestApiV1;

import com.renkoglu.ross3.Business.IService;
import com.renkoglu.ross3.Entities.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class MemberController {

    @Autowired
    @Qualifier("memberManager")
    private IService memberManager;

    public MemberController(IService memberManager) {
        this.memberManager = memberManager;
    }

    @GetMapping("/members")
    public List<Member> members() {
        return memberManager.getAll();
    }

    @GetMapping("/members/{id}")
    public Member getById(@PathVariable int id) {
        return (Member) memberManager.getById(id);
    }

    @PostMapping("/members")
    public void add(@RequestBody Member member) {
        memberManager.add(member);
    }

    @PutMapping("/members")
    public void update(@RequestBody Member member) {
        memberManager.update(member);
    }

    @DeleteMapping("/members")
    public void delete(@RequestBody Member member) {
        memberManager.delete(member);
    }

}


