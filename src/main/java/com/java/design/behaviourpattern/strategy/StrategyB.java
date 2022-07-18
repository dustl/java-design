package com.java.design.behaviourpattern.strategy;

/**
 * @author liwy
 * @date 2022/7/15
 */
public class StrategyB implements Strategy{
    @Override
    public void doStrategy() {
        System.out.println("do B 业务");
    }
}
