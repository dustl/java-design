package com.java.design.strategy;

/**
 * @author liwy
 * @date 2022/7/15
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void doContext() {
        strategy.doStrategy();
    }

}
