package com.java.design.structurepattern.proxy;

/**
 * @Author:liwy
 * @date: 22.7.17
 * @Version:1.0
 */
public class Service implements IService {
    @Override
    public Object get() {
        System.out.println("service get ");
        return new Service();
    }
}
