package com.java.design.structurepattern.bridge.circle;

/**
 * @Author:liwy
 * @date: 22.7.16
 * @Version:1.0
 */
public class GreenCircle implements DrawApi {


    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println("绿色的圆 ： x:" + x + " y:" + y + " radius:" + radius);
    }
}
