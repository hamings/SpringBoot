package com.example.dtcoin.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.HashMap;

@Mapper
public interface PointMapper {

    public int insertPoint(HashMap<String,Object> params);

    public ArrayList<HashMap<String,Object>> selectPoint(String email);

    public double checkBalance(String email);
}
