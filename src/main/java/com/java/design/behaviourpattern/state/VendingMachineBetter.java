package com.java.design.behaviourpattern.state;

/**
 * @Author:liwy
 * @date: 22.7.17
 * @Version:1.0
 */
public class VendingMachineBetter {

    private State hasMoneyState;

    private State NoMoneyState;

    private State SoldOutState;

    private State SoldSate;

    private State WinnerState;

    private State currentState;

    private int count;

    public VendingMachineBetter( int count) {
        this.hasMoneyState = new HasMoneyState(this);
        NoMoneyState = new NoMoneyState(this);
        SoldOutState = new SoldOutState(this);
        SoldSate = new SoldState(this);
        WinnerState = new WinnerState(this);
        if (count > 0) {
            this.count = count;
            currentState = getNoMoneyState();
        }else {
            throw new IllegalArgumentException("必须有商品");
        }

    }

    public void insertMoney() {
        this.currentState.insertMoney();
    }

    public void backMoney() {
        currentState.backMoney();
    }

    /**
     * 转动手柄
     * */
    public void turnCrank() {
        currentState.turnCrank();
        if (currentState == getSoldSate() || currentState == getWinnerState()) {
            // 出货
            currentState.dispense();
        }
    }

    public void dispense() {
        if (currentState == getSoldSate() || currentState == getWinnerState()) {
            dcrCount();
            System.out.println("出货！");
        }

    }

    public void dcrCount() {
        if (count > 0) {
            count--;
        }
    }


    public void setState(State state) {
        this.currentState = state;
    }

    public State getHasMoneyState() {
        return hasMoneyState;
    }

    public State getNoMoneyState() {
        return NoMoneyState;
    }

    public State getSoldOutState() {
        return SoldOutState;
    }

    public State getSoldSate() {
        return SoldSate;
    }

    public State getWinnerState() {
        return WinnerState;
    }

    public State getCurrentState() {
        return currentState;
    }

    public int getCount() {
        return count;
    }
}
