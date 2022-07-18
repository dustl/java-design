package com.java.design.behaviourpattern.state;

/**
 * @Author:liwy
 * @date: 22.7.17
 * @Version:1.0
 */
public class SoldState implements State {

    private VendingMachineBetter vendingMachineBetter;

    public SoldState(VendingMachineBetter vendingMachineBetter) {
        this.vendingMachineBetter = vendingMachineBetter;
    }

    @Override
    public void insertMoney() {
        System.out.println("正在出货,请勿投币");
    }

    @Override
    public void backMoney() {
        System.out.println("正在出货,没有可退的钱");
    }

    @Override
    public void turnCrank() {
        System.out.println("正在出货,请勿重复摇动手柄");
    }

    @Override
    public boolean dispense() {
        vendingMachineBetter.dispense();
        if (vendingMachineBetter.getCount() > 0) {
            // 出货成功，重置状态
            vendingMachineBetter.setState(vendingMachineBetter.getNoMoneyState());
            return true;
        }
        System.out.println("商品售罄");
        vendingMachineBetter.setState(vendingMachineBetter.getSoldOutState());
        return false;

    }
}
