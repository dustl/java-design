package com.java.design.singleton.hungry;

/**
 * @author liwy
 * @date 2022/7/14
 */
public class Hungry {
    private Hungry() {

    }

    public static final Hungry hungry = new Hungry();

    public static Hungry getInstance() {
        return hungry;
    }

}
