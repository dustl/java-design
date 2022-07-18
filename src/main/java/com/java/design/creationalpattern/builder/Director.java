package com.java.design.creationalpattern.builder;

/**
 * @Author:liwy
 * @date: 22.7.16
 * @Version:1.0
 */
public class Director {



    public Product getAProduct() {
        Builder builder = new ConcreteBuilder();
        builder.setPart("奥迪", "Q5");
        return builder.getProduct();
    }

    public Product getBProduct() {
        Builder builder = new ConcreteBuilder();
        builder.setPart("宝马", "x7");
        return builder.getProduct();
    }

}
