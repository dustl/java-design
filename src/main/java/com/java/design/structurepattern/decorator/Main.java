package com.java.design.structurepattern.decorator;

/**
 * @Author:liwy
 * @date: 22.7.16
 * @Version:1.0
 * 装饰器模式 jdk的io就有用上
 * 应用场景：  扩展一个类的功能
 * 动态的添加功能，动态撤销，继承做不到这点
 * 特点： 装饰器类与被装饰器类 继承同样的父类，这样就可以对原始类嵌套多个装饰器类
 * */
public class Main {
    public static void main(String[] args) {
        ConcreteDecorator concreteDecorator = new ConcreteDecorator(new ConcreteComponent());
        concreteDecorator.method();


        ConcreteDecorator concreteDecorator2 = new ConcreteDecorator(new ConcreteComponent2());
        concreteDecorator2.method();
    }



}
