package com.java.design.singleton.lazy;

/**
 * @author liwy
 * @date 2022/7/14
 */
public class LazyTwo {

    public static volatile LazyTwo lazyTwo = null;

    private LazyTwo() {

    }

    public static LazyTwo getInstance() {
        if (lazyTwo == null) {
            synchronized (LazyTwo.class) {
                if (lazyTwo == null) {
                    lazyTwo= new LazyTwo();
                }
            }
        }
        return lazyTwo;
    }





}
