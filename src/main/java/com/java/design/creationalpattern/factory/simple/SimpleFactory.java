package com.java.design.creationalpattern.factory.simple;

import com.java.design.creationalpattern.factory.model.BluetoothSender;
import com.java.design.creationalpattern.factory.model.Sender;
import com.java.design.creationalpattern.factory.model.WifiSender;

/**
 * @Author:liwy
 * @date: 22.7.16
 * @Version:1.0
 *
 * 简单工厂方法的特点在于，有必要的判断逻辑，生成不同的产品。根据调用者的参数动态控制产品的生成，
 * 缺点在于扩展的时候需要修改原来的工厂方法，违反开放封闭原则
 * 工厂方法模式则是符合开放封闭的，扩展的时候增加扩展类
 *
 *
 */
public class SimpleFactory {
    public static final String WIFI = "wifi";

    public static final String BLUETOOTH = "bluetooth";

    public static Sender createSender(String mode) {

        switch (mode) {
            case WIFI:
                return new WifiSender();
            case BLUETOOTH:
                return new BluetoothSender();
            default:
                throw new IllegalArgumentException("不支持该类型");
        }



    }

}
