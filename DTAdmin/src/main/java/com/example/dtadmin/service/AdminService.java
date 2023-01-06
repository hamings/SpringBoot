package com.example.dtadmin.service;

import com.example.dtadmin.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class AdminService {

    @Autowired
    AdminRepository repo;

    public HashMap<String, Object> selectAdmin(HashMap<String, Object> params){
        return repo.selectAdmin(params);
    }

    public int selectCntMember(){
        return repo.selectCntMember();
    }
    public double selectAmountPayment(){
        return repo.selectAmountPayment();
    }

    public int selectCntBuy(){
        return repo.selectCntBuy();
    }

    public int selectCntContact(){
        return repo.selectCntContact();
    }


    public ArrayList<HashMap<String,Object>> selectMember(){
        return repo.selectMember();
    }

    public ArrayList<HashMap<String,Object>> selectPayment(){
        return repo.selectPayment();
    }

    public ArrayList<HashMap<String,Object>> selectBuy(){
        return repo.selectBuy();
    }

    public ArrayList<HashMap<String,Object>> selectContact(){
        return repo.selectContact();
    }

    public ArrayList<HashMap<String,Object>> selectSubscribe(){
        return repo.selectSubscribe();
    }


}
