package com.java.design.creationalpattern.builder;

/**
 * @Author:liwy
 * @date: 22.7.16
 * @Version:1.0
 */
public class Main {


    public static void main(String[] args) {

        Director director = new Director();
        Product aProduct = director.getAProduct();
        Product bProduct = director.getBProduct();
        System.out.println(aProduct);
        System.out.println(bProduct);

    }
}
