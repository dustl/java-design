package com.java.design.creationalpattern.factory.model;

/**
 * @Author:liwy
 * @date: 22.7.16
 * @Version:1.0
 */
public interface Sender {

    /**
     * 发送数据
     * 具体实现看各个子类。
     * */
    void send(byte[] data);
}
