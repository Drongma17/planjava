package com.thonglam.javatechie.methodreference.referencetoconstructor;

interface Messageable {
    Message sendMessage(String mesg);
}

class Message{
    Message(String msg){
        System.out.println(msg);
    }
}


class ConstructoreMessage{
    public static void main(String[] args) {
        Messageable aNew = Message::new;
        aNew.sendMessage("hello");
    }
}