package com.example.dtcoin.service;

import com.example.dtcoin.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class MemberService {

    @Autowired
    MemberRepository mr;

    public int insertMember(HashMap<String,String> member){
        return mr.insertMember(member);
    }

    public String loginMember(HashMap<String,String> member){
        return mr.loginMember(member);
    }
}
