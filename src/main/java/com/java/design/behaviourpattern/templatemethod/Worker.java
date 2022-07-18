package com.java.design.behaviourpattern.templatemethod;

import java.util.Date;

/**
 * @Author:liwy
 * @date: 22.7.17
 * @Version:1.0
 * 模板方法的三个角色：
 *  1具体方法 模板方法
 *  2抽象方法
 *  3钩子方法，由子类决定实现
 */
public abstract class Worker {


    protected String name;


    public Worker(String name) {
        this.name = name;
    }

    public final void workOneDay() {
        System.out.println("出门");
        enterCompany();
        openComputer();
        work();
        closeComputer();
        exitCompany();
        System.out.println("回家");
    }

    public abstract void work();


    protected boolean isNeedPrintDate() {
        return false;
    }

    public void openComputer() {
        System.out.println("打开电脑");
    }

    public void closeComputer() {
        if (isNeedPrintDate()) {
            System.out.println("当前时间： " + new Date());
        }
        System.out.println("关闭电脑");
    }

    private void exitCompany() {
        System.out.println("离开公司");
    }

    private void enterCompany() {
        System.out.println("进入公司");
    }






}
