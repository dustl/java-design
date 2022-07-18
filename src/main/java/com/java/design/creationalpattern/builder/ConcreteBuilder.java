package com.java.design.creationalpattern.builder;

/**
 * @Author:liwy
 * @date: 22.7.16
 * @Version:1.0
 */
public class ConcreteBuilder extends Builder {
    Product product = new Product();

    @Override
    public void setPart(String name, String type) {
        product.setName(name);
        product.setType(type);
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
