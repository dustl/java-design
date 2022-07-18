package com.java.design.behaviourpattern.state;

/**
 * @Author:liwy
 * @date: 22.7.17
 * @Version:1.0
 */
public class Main {

    public static void main(String[] args) {
        VendingMachineBetter vendingMachineBetter =
                new VendingMachineBetter(3);

        vendingMachineBetter.dispense();
        System.out.println(vendingMachineBetter.getCount());
        vendingMachineBetter.insertMoney();
        vendingMachineBetter.backMoney();

        vendingMachineBetter.insertMoney();
        vendingMachineBetter.dispense();
        System.out.println("getState : " +vendingMachineBetter.getCurrentState());

        System.out.println(vendingMachineBetter.getCount());
        vendingMachineBetter.turnCrank();
        System.out.println("getState : " +vendingMachineBetter.getCurrentState());
        vendingMachineBetter.dispense();
        System.out.println(vendingMachineBetter.getCount());

    }
}
