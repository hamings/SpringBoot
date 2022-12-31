package com.example.dtcoin.repository;

import com.example.dtcoin.mapper.ContactMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class ContactRepository {

    @Autowired
    ContactMapper cm;

    public int subscribe(HashMap<String,String> member){
        return cm.subscribe(member);
    }

    public int requestCall(HashMap<String,String> member){
        return cm.requestCall(member);
    }
}
