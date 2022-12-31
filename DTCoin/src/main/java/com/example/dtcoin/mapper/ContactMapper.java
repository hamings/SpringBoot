package com.example.dtcoin.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;

@Mapper
public interface ContactMapper {

    public int subscribe(HashMap<String,String> member);

    public int requestCall(HashMap<String,String> member);
}
