package com.java.design.creationalpattern.factory.abstractfactory;

import com.java.design.creationalpattern.factory.model.Sender;

/**
 * @Author:liwy
 * @date: 22.7.16
 * @Version:1.0
 */
public class Main {

    public static void main(String[] args) {
        SenderFactory senderFactory = new SenderFactory();
        Sender bluetoothSender = senderFactory.createBluetoothSender();
        Sender wifiSender = senderFactory.createWifiSender();
        bluetoothSender.send(new byte[]{1});
        wifiSender.send(new byte[]{1});
    }


}
