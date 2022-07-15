package com.java.design.singleton.lazy;

/**
 * @author liwy
 * @date 2022/7/14
 */
public class LazyThree {
    public static Boolean init= false;

    /**
     * 防止反射注入
     *
     * */
    private LazyThree() {
        synchronized (LazyThree.class) {
            if (!init) {
                init =true;
            }else {
                throw new IllegalStateException("单例已初始化!!");
            }
        }
    }

    public static final LazyThree getInstance() {
        return LazyContext.lazyThree;
    }


    private static class LazyContext{
        private static final LazyThree lazyThree = new LazyThree();
    }


}
