package com.websocket.demo.chat;


import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ChatMessage {
    private String content;
    private String timestamp;
    private String sender;
    private MessageType type;
    private int onlineUser;
    private static int amount;

    public static int joinUser(){
        return ++amount;
    }

    public static int leaveUser(){
        return --amount;
    }

    public void setOnlineUser(int amount){
        onlineUser = amount;
    }

}
