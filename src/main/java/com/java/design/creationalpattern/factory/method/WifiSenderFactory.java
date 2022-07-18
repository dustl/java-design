package com.java.design.creationalpattern.factory.method;

import com.java.design.creationalpattern.factory.model.Sender;
import com.java.design.creationalpattern.factory.model.WifiSender;

/**
 * @Author:liwy
 * @date: 22.7.16
 * @Version:1.0
 */
public class WifiSenderFactory implements SenderFactory {

    @Override
    public Sender createSender() {
        return new WifiSender();
    }

}
