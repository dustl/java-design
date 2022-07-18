package com.java.design.structurepattern.bridge.circle;

/**
 * @Author:liwy
 * @date: 22.7.16
 * @Version:1.0
 */
public class Circle extends Shape {
    private int x,y, radius;
    public Circle(int x, int y, int radius,DrawApi drawApi) {
        super(drawApi);
        this.x =x;
        this.y =y;
        this.radius = radius;
    }

    @Override
    void draw() {
        drawApi.drawCircle(x, y, radius);
    }
}
