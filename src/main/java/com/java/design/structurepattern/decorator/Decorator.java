package com.java.design.structurepattern.decorator;

/**
 * @Author:liwy
 * @date: 22.7.16
 * @Version:1.0
 */
public abstract class Decorator implements Component {

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }


    @Override
    public void method() {
        component.method();
    }
}
