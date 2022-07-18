package com.java.design.creationalpattern.builder;

/**
 * @Author:liwy
 * @date: 22.7.16
 * @Version:1.0
 */
public class Product {
    private String name;

    private String type;

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
