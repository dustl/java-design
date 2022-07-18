package com.java.design.behaviourpattern.state;

/**
 * @Author:liwy
 * @date: 22.7.17
 * @Version:1.0
 * 中奖状态，
 */
public class WinnerState implements State {

    private VendingMachineBetter vendingMachineBetter;

    public WinnerState(VendingMachineBetter vendingMachineBetter) {
        this.vendingMachineBetter = vendingMachineBetter;
    }

    @Override
    public void insertMoney() {
        throw new IllegalStateException("非法操作!");
    }

    @Override
    public void backMoney() {
        throw new IllegalStateException("非法操作!");
    }

    @Override
    public void turnCrank() {
        throw new IllegalStateException("非法操作!");
    }

    @Override
    public boolean dispense() {
        System.out.println("您中奖了, 恭喜您,将获得2件商品");
        vendingMachineBetter.dispense();
        if (vendingMachineBetter.getCount() == 0) {
            System.out.println("很遗憾，商品已售罄");
            return false;
        }else {
            vendingMachineBetter.dispense();
            if (vendingMachineBetter.getCount() > 0) {
                vendingMachineBetter.setState(vendingMachineBetter.getNoMoneyState());
                return true;
            }else {
                vendingMachineBetter.setState(vendingMachineBetter.getSoldOutState());
                return false;
            }
        }

    }
}
