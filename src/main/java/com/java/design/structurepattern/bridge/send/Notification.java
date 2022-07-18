package com.java.design.structurepattern.bridge.send;

/**
 * @Author:liwy
 * @date: 22.7.16
 * @Version:1.0
 */
public abstract class Notification {

    protected MessageSender messageSender;

    public Notification(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    abstract void notify(String message);

}
