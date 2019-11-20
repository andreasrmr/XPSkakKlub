package com.dat18c.xpskakklub.services;

import com.dat18c.xpskakklub.models.Contingent;
import com.dat18c.xpskakklub.models.Member;
import com.dat18c.xpskakklub.repos.ReMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SeMember {

    @Autowired
    ReMember reMember;

    public Member findById(int id){
        Optional<Member> memberOptional = reMember.findById(id);
        if(memberOptional.isPresent()){
            return memberOptional.get();
        }
        else {
            throw new RuntimeException("Member not found");
        }
    }

    public List<Member> getAll(){
        List<Member> members = new ArrayList<>();
        for(Member member : reMember.findAll()){
            members.add(member);
        }
        return members;
    }
    public void delete(int id){
        reMember.deleteById(id);
    }
    public void save(Member member) {
        reMember.save(member);
    }


}
