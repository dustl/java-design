package com.java.design.behaviourpattern.strategy;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author liwy
 * @date 2022/7/15
 * 策略模式 ：  先定义算法族，应对不同客户端需求，
 * 策略可以bean的方式注入，key就是类名，value对应各个实现类。
 * 或者自定义初始化也行
 */
public class StrategyFactory {
    private static final ConcurrentHashMap<String, Strategy> strategyMap = new ConcurrentHashMap<>();

    static {
        strategyMap.put("A", new StrategyA());
        strategyMap.put("B", new StrategyB());
    }

    private StrategyFactory() {
    }

    public static Strategy getStrategy(String type) {
        return strategyMap.get(type);
    }

}
