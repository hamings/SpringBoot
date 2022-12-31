package com.example.dtcoin.service;

import com.example.dtcoin.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class ContactService {

    @Autowired
    ContactRepository cr;

    public int subscribe(HashMap<String,String> member){
        return cr.subscribe(member);
    }

    public int requestCall(HashMap<String,String> member){
        return cr.requestCall(member);
    }
}
