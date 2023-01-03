package com.example.dtcoin.service;

import com.example.dtcoin.repository.CoinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class CoinService {

    @Autowired
    CoinRepository cr;

    public int insertBuy(HashMap<String,Object> params){
        return cr.insertBuy(params);
    }

    public ArrayList<HashMap<String,Object>> selectBuy(String email){
        return cr.selectBuy(email);
    }
}
