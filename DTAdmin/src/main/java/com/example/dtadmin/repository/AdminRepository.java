package com.example.dtadmin.repository;

import com.example.dtadmin.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;

@Repository
public class AdminRepository {

    @Autowired
    AdminMapper mapper;

    public HashMap<String, Object> selectAdmin(HashMap<String,Object> params){
        return mapper.selectAdmin(params);
    }

    public int selectCntMember(){
        return mapper.selectCntMember();
    }

    public double selectAmountPayment(){
        return mapper.selectAmountPayment();
    }

    public int selectCntBuy(){
        return mapper.selectCntBuy();
    }

    public int selectCntContact(){
        return mapper.selectCntContact();
    }

    public ArrayList<HashMap<String,Object>> selectMember(){
        return mapper.selectMember();
    }

    public ArrayList<HashMap<String,Object>> selectPayment(){
        return mapper.selectPayment();
    }

    public ArrayList<HashMap<String,Object>> selectBuy(){
        return mapper.selectBuy();
    }

    public ArrayList<HashMap<String,Object>> selectContact(){
        return mapper.selectContact();
    }

    public ArrayList<HashMap<String,Object>> selectSubscribe(){
        return mapper.selectSubscribe();
    }

}
