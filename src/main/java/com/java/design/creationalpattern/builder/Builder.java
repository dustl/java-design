package com.java.design.creationalpattern.builder;

/**
 * @Author:liwy
 * @date: 22.7.16
 * @Version:1.0
 */
public abstract class Builder {

    public abstract void setPart(String name, String type);

    public abstract Product getProduct();


}
