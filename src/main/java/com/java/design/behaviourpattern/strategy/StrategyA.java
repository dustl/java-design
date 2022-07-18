package com.java.design.behaviourpattern.strategy;

/**
 * @author liwy
 * @date 2022/7/15
 */

public class StrategyA implements com.java.design.behaviourpattern.strategy.Strategy {
    @Override
    public void doStrategy() {
        System.out.println("do A 业务");
    }
}
