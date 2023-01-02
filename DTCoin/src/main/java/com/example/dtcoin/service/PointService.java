package com.example.dtcoin.service;

import com.example.dtcoin.repository.PointRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class PointService {

    @Autowired
    PointRepository pr;

    public int insertPoint(HashMap<String,Object> params){
        return pr.insertPoint(params);
    }

    public ArrayList<HashMap<String,Object>> selectPoint(String email){
        return pr.selectPoint(email);
    }
}
