package com.java.design.behaviourpattern.strategy;

/**
 * @author liwy
 * @date 2022/7/15
 */
public class Main {

    public static void main(String[] args) {
        Strategy strategy = StrategyFactory.getStrategy("A");
        if (strategy != null) {
            strategy.doStrategy();
        }
    }
}
