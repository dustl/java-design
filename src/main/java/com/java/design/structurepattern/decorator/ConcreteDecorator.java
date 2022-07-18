package com.java.design.structurepattern.decorator;

/**
 * @Author:liwy
 * @date: 22.7.16
 * @Version:1.0
 */
public class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void method() {
        // 功能增强
        System.out.println("before do....");
        super.method();
        // 功能增强
        System.out.println("after do .....");

    }
}
