package com.thonglam.mixing;

import com.thonglam.mixing.Message;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessageResource {


    public String getServerTime(){
        System.out.println("Service message is running ");
        return "received ping on "+ new Date().toString();
    }


    public List<Message> getAllMessage() throws Exception{
        List<Message> messages = new ArrayList<>();

        Message ms = new Message();

        ms.setDate(new Date());
        ms.setFirstName("Ngawang");
        ms.setLastName("Yeshi");
        ms.setText("This is my message");
        messages.add(ms);
        return messages;
    }

    public String postMessage(Message message) throws IOException{
        System.out.println("First Name"+ message.getFirstName());
        System.out.println("Last Name"+ message.getLastName());
        return "ok";
    }



}
