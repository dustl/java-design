package com.java.design.structurepattern.bridge.send;

/**
 * @Author:liwy
 * @date: 22.7.16
 * @Version:1.0
 */
public class UrgencyNotification extends Notification {

    public UrgencyNotification(MessageSender messageSender) {
        super(messageSender);
    }


    @Override
    void notify(String message) {
        messageSender.send(message);
    }


}
