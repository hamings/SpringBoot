package com.example.dtcoin.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.HashMap;

@Mapper
public interface CoinMapper {

    public int insertBuy(HashMap<String,Object> params);

    public ArrayList<HashMap<String,Object>> selectBuy(String email);
}
