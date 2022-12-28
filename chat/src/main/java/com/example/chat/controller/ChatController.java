package com.example.chat.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

@RestController
public class ChatController {

    static ArrayList<ArrayList<String>> msgList = new ArrayList<ArrayList<String>>();

    @GetMapping("/chat/getMsg")
    public ArrayList<ArrayList<String>> msg(){
        return msgList;
    }
    @GetMapping("/chat/sendMsg")
    public void receiveMsg(HttpSession session, String msg){
        ArrayList<String> msgContent = new ArrayList<>();

        String nickName = String.valueOf(session.getAttribute("nickName"));

        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date time = new Date();
        String timeStr = format1.format(time);

        msgContent.add(nickName);
        msgContent.add(msg);
        msgContent.add(timeStr);

        msgList.add(msgContent);

    }


}
