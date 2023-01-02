package com.example.dtcoin.repository;

import com.example.dtcoin.mapper.PointMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;

@Repository
public class PointRepository {

    @Autowired
    PointMapper pm;

    public int insertPoint(HashMap<String,Object> params){
        return pm.insertPoint(params);
    }

    public ArrayList<HashMap<String,Object>> selectPoint(String email){
        return pm.selectPoint(email);
    }
}
