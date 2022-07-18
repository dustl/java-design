package com.java.design.creationalpattern.factory.abstractfactory;

import com.java.design.creationalpattern.factory.model.BluetoothSender;
import com.java.design.creationalpattern.factory.model.Sender;
import com.java.design.creationalpattern.factory.model.WifiSender;

/**
 * @Author:liwy
 * @date: 22.7.16
 * @Version:1.0
 * 工厂方法的好处在于，对应某个业务类的创建，若需要进行一些初始化操作，或者配置一些数据，可以统一在工厂方法获取
 * 这样逻辑写一处即可，而不是初始化逻辑分布在各个创建该类的地方，太过散乱，不便于管理。
 */
public class SenderFactory extends AbstractFactory {

    /**
     * 创建蓝牙实现
     * */
    @Override
    public  Sender createBluetoothSender() {
        return new BluetoothSender();
    }

    /**
     * 创建wifi实现
     * */
    @Override
    public Sender createWifiSender() {
        return new WifiSender();
    }
}
