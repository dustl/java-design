package com.java.design.structurepattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author:liwy
 * @date: 22.7.17
 * @Version:1.0
 */
public class ProxyService implements InvocationHandler {
    private Object target;

    public ProxyService(Object object) {
        this.target = object;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("before");
//        method.invoke(target,args);
        System.out.println("after");

        return target;
    }
}
