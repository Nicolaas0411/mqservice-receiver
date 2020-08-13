package com.example.rabbitmqservice.mqservice;

import java.util.concurrent.CountDownLatch;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    private CountDownLatch latch = new CountDownLatch(1);

    public void receiveMessage(String message) {
        System.out.println("Hello " + message +", I am your father!");
        latch.countDown();
    }

    public CountDownLatch getLatch() {
        return latch;
    }

}