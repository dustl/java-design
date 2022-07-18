package com.java.design.creationalpattern.factory.simple;

import com.java.design.creationalpattern.factory.model.Sender;

/**
 * @Author:liwy
 * @date: 22.7.16
 * @Version:1.0
 */
public class Main {

    public static void main(String[] args) {
        Sender wifi = SimpleFactory.createSender("wifi");
        wifi.send(new byte[]{1});

    }
}
