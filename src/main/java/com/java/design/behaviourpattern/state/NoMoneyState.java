package com.java.design.behaviourpattern.state;

/**
 * @Author:liwy
 * @date: 22.7.17
 * @Version:1.0
 */
public class NoMoneyState implements State {

    private VendingMachineBetter vendingMachineBetter;


    public NoMoneyState(VendingMachineBetter vendingMachineBetter) {
        this.vendingMachineBetter = vendingMachineBetter;
    }

    @Override
    public void insertMoney() {
        System.out.println("投币成功啦!!");
        vendingMachineBetter.setState(vendingMachineBetter.getHasMoneyState());
    }

    @Override
    public void backMoney() {
        System.out.println("您没投币就像退钱? 您这算抢!");
    }

    @Override
    public void turnCrank() {
        System.out.println("您未投币就想摇杆,您在逗我吧!");
    }

    @Override
    public boolean dispense() {
        System.out.println("这商品要是出了,我跟你姓");
        return false;
    }
}
