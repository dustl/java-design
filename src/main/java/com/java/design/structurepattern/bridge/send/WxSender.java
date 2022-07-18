package com.java.design.structurepattern.bridge.send;

/**
 * @Author:liwy
 * @date: 22.7.16
 * @Version:1.0
 */
public class WxSender implements MessageSender {
    @Override
    public void send(String message) {
        System.out.println("微信发送.."+message);
    }
}
