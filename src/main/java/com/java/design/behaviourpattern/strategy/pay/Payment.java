package com.java.design.behaviourpattern.strategy.pay;

/**
 * @author liwy
 * @date 2022/7/15
 */
public interface Payment {

    /**
     * 付费
     * */
    PayResult pay(String uid, double amount);


}
