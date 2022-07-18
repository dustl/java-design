package com.java.design.behaviourpattern.state;

/**
 * @Author:liwy
 * @date: 22.7.17
 * @Version:1.0
 */
public class SoldOutState implements State {

    private VendingMachineBetter vendingMachineBetter;

    public SoldOutState(VendingMachineBetter vendingMachineBetter) {
        this.vendingMachineBetter = vendingMachineBetter;
    }

    @Override
    public void insertMoney() {
        System.out.println("投币失败,商品已售罄..");
    }

    @Override
    public void backMoney() {
        System.out.println("-您未投币,想退钱么?");
    }

    @Override
    public void turnCrank() {
        System.out.println("商品售罄，转动手柄也木有用.");
    }

    @Override
    public boolean dispense() {
        System.out.println("非法状态");
        return false;
    }
}
