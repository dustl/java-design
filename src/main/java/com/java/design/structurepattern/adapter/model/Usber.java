package com.java.design.structurepattern.adapter.model;

/**
 * @Author:liwy
 * @date: 22.7.16
 * @Version:1.0
 */
public class Usber implements Usb {
    @Override
    public boolean isUsb() {
        System.out.println("这是一个usb接口");
        return true;
    }
}
