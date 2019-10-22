package com.kodilla.exception.nullpointer;

public class NullPointerExceptionRunner {
    public static void main(String[] args) {
        User user = null;
        MessageSender messageSender = new MessageSender();

        try {
            messageSender.sendMessageTo(user, "Henlo");
        }catch (MessageNotSentException e){
            System.out.println("Message is not send," + " but my program is still running");
        }
        System.out.println("processing other logic");
    }
}
