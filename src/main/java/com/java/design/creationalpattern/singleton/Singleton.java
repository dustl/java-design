package com.java.design.creationalpattern.singleton;

/**
 * @author liwy
 * @date 2022/7/14
 * jvm层面加载类时，同一时刻只允许一个线程加载，
 */
public class Singleton {

    public static final Singleton getInstance() {
        return SingletonContext.singleton;
    }

    private Singleton() {

    }

    private static class SingletonContext{
        private static Singleton singleton = new Singleton();
    }

}
