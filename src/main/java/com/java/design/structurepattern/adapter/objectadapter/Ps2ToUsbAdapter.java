package com.java.design.structurepattern.adapter.objectadapter;

import com.java.design.structurepattern.adapter.model.Ps2;
import com.java.design.structurepattern.adapter.model.Usb;

/**
 * @Author:liwy
 * @date: 22.7.16
 * @Version:1.0
 */
public class Ps2ToUsbAdapter implements Ps2 {

    private Usb usb;

    public Ps2ToUsbAdapter(Usb usb) {
        this.usb = usb;
    }

    @Override
    public boolean isPs2() {
        return usb.isUsb();
    }
}
