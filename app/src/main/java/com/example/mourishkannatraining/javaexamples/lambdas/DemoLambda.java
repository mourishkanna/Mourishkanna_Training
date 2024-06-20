package com.example.mourishkannatraining.javaexamples.lambdas;

public class DemoLambda {
    public static void main(String[] args) {
        //before lamdas
        MessageImplementation message = new MessageImplementation();
        message.sendMessage();

        //after lamdas
        iMessage IMessage = () -> {
            System.out.println("sending message1 from lamda");
            System.out.println("sending message2 from lamda");
            System.out.println("sending message3 from lamda");

        };
        IMessage.sendMessage();
    }
}