package com.java.design.creationalpattern.factory.abstractfactory;

import com.java.design.creationalpattern.factory.model.Sender;

/**
 * @Author:liwy
 * @date: 22.7.16
 * @Version:1.0
 * 提供一个接口，创建相关的的依赖对象，但不需要明确指定具体实现，实现依赖抽象。
 * 当然也可以定义接口
 */

public abstract class AbstractFactory {

    public abstract Sender createBluetoothSender();

    public abstract Sender createWifiSender();







}
