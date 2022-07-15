package com.java.design.singleton.lazy;

/**
 * @author liwy
 * @date 2022/7/14
 */
public class LazyOne {

    public static  LazyOne lazyOne = null;

    private LazyOne() {

    }

    public static LazyOne getInstance() {
        // 有线程安全问题
        if (lazyOne == null) {
            lazyOne = new LazyOne();
        }
        return lazyOne;
    }

}
