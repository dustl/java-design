package com.java.design.creationalpattern.factory.model;

/**
 * @Author:liwy
 * @date: 22.7.16
 * @Version:1.0
 */
public class BluetoothSender implements Sender {


    @Override
    public void send(byte[] data) {
        System.out.println("bluetoothsend....");
    }


}
