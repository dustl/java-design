package com.java.design.creationalpattern.prototype;

import java.math.BigDecimal;

/**
 * @Author:liwy
 * @date: 22.7.16
 * @Version:1.0
 */
public class Fruit implements Cloneable{

    private String name;

    private BigDecimal price;


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
