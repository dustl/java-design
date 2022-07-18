package com.java.design.structurepattern.adapter.classadapter;

import com.java.design.structurepattern.adapter.model.Ps2;
import com.java.design.structurepattern.adapter.model.Usber;

/**
 * @Author:liwy
 * @date: 22.7.16
 * @Version:1.0
 */
public class Ps2ToUsbAdapter extends Usber implements Ps2 {
    @Override
    public boolean isPs2() {
        System.out.println("ps2转usb接口");
        return isUsb();
    }
}
