package com.java.design.creationalpattern.factory.method;

import com.java.design.creationalpattern.factory.model.Sender;

/**
 * @Author:liwy
 * @date: 22.7.16
 * @Version:1.0
 * 子类决定使用哪个，工厂方法模式把类实例化的过程推迟到子类。
 */
public class Main {


    public static void main(String[] args) {
        //通过策略控制工厂
        String str = "wifi";
        SenderFactory senderFactory;
        if ("wifi".equals(str)) {
            senderFactory = new WifiSenderFactory();
        }else {
            senderFactory = new BluetoothSenderFactory();
        }

        Sender sender = senderFactory.createSender();
        sender.send(new byte[]{1});

    }
}
