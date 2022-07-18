package com.java.design.structurepattern.bridge.circle;

/**
 * @Author:liwy
 * @date: 22.7.16
 * @Version:1.0
 */
public class RedCircle implements DrawApi {


    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println("画共色的圆，x:" + x + " y:" + " radius :" + radius);
    }
}
