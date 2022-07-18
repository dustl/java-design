package com.java.design.structurepattern.decorator;

/**
 * @Author:liwy
 * @date: 22.7.16
 * @Version:1.0
 * 原本的方法实现类，即：被装饰的
 */
public class ConcreteComponent implements Component {
    @Override
    public void method() {
        System.out.println("source method...");
    }
}
