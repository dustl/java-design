package com.java.design.structurepattern.proxy;

import java.lang.reflect.Proxy;

/**
 * @Author:liwy
 * @date: 22.7.17
 * @Version:1.0
 */
public class Main {

    public static void main(String[] args) {
        Service service = new Service();
        IService proxy = (IService) Proxy.newProxyInstance(service.getClass().getClassLoader(),
                service.getClass().getInterfaces(),
                new ProxyService(service));

        Object o = proxy.get();

    }
}
