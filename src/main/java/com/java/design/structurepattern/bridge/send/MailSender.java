package com.java.design.structurepattern.bridge.send;

/**
 * @Author:liwy
 * @date: 22.7.16
 * @Version:1.0
 */
public class MailSender implements MessageSender {
    @Override
    public void send(String message) {
        System.out.println("邮箱发送.." + message);

    }
}
