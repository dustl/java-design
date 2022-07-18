package com.java.design.behaviourpattern.state;

import java.util.Random;

/**
 * @Author:liwy
 * @date: 22.7.17
 * @Version:1.0
 */
public class HasMoneyState implements State {

    private VendingMachineBetter vendingMachineBetter;

    public HasMoneyState(VendingMachineBetter vendingMachineBetter) {
        this.vendingMachineBetter = vendingMachineBetter;
    }


    @Override
    public void insertMoney() {
        System.out.println("您已经投过币啦！！");
    }

    @Override
    public void backMoney() {
        System.out.println("退钱成功");
        vendingMachineBetter.setState(vendingMachineBetter.getNoMoneyState());

    }

    @Override
    public void turnCrank() {
        System.out.println("转动了手柄");
        int winner = new Random().nextInt(10);
//        int winner = 0;
        if (winner == 0 && vendingMachineBetter.getCount() > 1) {
            vendingMachineBetter.setState(vendingMachineBetter.getWinnerState());

        }else {
            vendingMachineBetter.setState(vendingMachineBetter.getSoldSate());
        }

    }

    @Override
    public boolean dispense() {
        System.out.println("只有在售出状态才能出货");
        return false;
    }
}
