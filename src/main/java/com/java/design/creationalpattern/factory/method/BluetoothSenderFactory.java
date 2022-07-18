package com.java.design.creationalpattern.factory.method;

import com.java.design.creationalpattern.factory.model.BluetoothSender;
import com.java.design.creationalpattern.factory.model.Sender;

/**
 * @Author:liwy
 * @date: 22.7.16
 * @Version:1.0
 */
public class BluetoothSenderFactory implements SenderFactory {


    @Override
    public Sender createSender() {
        return new BluetoothSender();
    }


}
