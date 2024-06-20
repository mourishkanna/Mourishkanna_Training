package com.example.mourishkannatraining.javaexamples.lambdas;

public class MessageImplementation implements iMessage{
    @Override
    public void sendMessage() {
        System.out.println("Sending message from Implementation");
    }
}