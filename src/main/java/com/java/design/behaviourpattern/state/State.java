package com.java.design.behaviourpattern.state;

/**
 * @Author:liwy
 * @date: 22.7.17
 * @Version:1.0
 *
 * 状态的接口
 */
public interface State {

    /**
     * 放钱
     * */
    void insertMoney();

    /**
     *
     * 退钱
     * */
    void backMoney();


    /**
     * 转动手柄
     * */
    void turnCrank();

    /**
     * 出商品
     * */
    boolean dispense();




}
