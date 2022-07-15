package com.java.design.singleton.lazy;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.lang.reflect.Constructor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author liwy
 * @date 2022/7/14
 */
public class Main {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        executorService.submit(() -> {
            System.out.println(LazyThree.getInstance());
        });
        executorService.submit(() -> {
            System.out.println(LazyThree.getInstance());
        });
        executorService.submit(() -> {
            System.out.println(LazyThree.getInstance());
        });

        // 反射创建，异常
        try {
            Constructor<LazyThree> constructor = LazyThree.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            LazyThree lazyThree = constructor.newInstance();
            System.out.println(lazyThree);
        } catch (Exception e) {
            e.printStackTrace();
        }


        executorService.shutdown();
    }
}
