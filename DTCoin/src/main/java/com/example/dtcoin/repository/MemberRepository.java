package com.example.dtcoin.repository;

import com.example.dtcoin.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class MemberRepository {

    @Autowired
    MemberMapper mm;

    public int insertMember(HashMap<String,String> member){
        return mm.insertMember(member);
    }

    public String loginMember(HashMap<String,String> member){
        return mm.loginMember(member);
    }
}
