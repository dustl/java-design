package com.java.design.structurepattern.bridge.circle;

/**
 * @Author:liwy
 * @date: 22.7.16
 * @Version:1.0
 * 桥接模式把实现与抽象解耦,使二者独立化
 * 抽象，并不是说是抽象类，而是对某一类的抽象，如：jdbc
 *
 */
public class Main {

    public static void main(String[] args) {
        Circle circleRed = new Circle(1, 2, 3, new RedCircle());
        Circle circleGreen = new Circle(1, 2, 4, new GreenCircle());

        circleRed.draw();
        circleGreen.draw();
    }
}
