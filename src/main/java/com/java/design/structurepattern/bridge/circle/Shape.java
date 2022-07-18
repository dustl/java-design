package com.java.design.structurepattern.bridge.circle;

/**
 * @Author:liwy
 * @date: 22.7.16
 * @Version:1.0
 * 在定义一个抽象，封装drawapi，
 */
public abstract class Shape {

    protected DrawApi drawApi;

    protected Shape(DrawApi drawApi) {
        this.drawApi = drawApi;
    }

    abstract void draw();



}
