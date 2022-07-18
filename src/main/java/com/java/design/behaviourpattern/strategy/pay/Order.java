package com.java.design.behaviourpattern.strategy.pay;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author liwy
 * @date 2022/7/15
 */
@AllArgsConstructor
@Data
public class Order {

    private String uid;

    private double money;


    public PayResult pay(PayEnum payEnum) {
        return payEnum.getPayment().pay(uid, money);
    }

}
