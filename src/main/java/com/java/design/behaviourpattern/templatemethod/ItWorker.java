package com.java.design.behaviourpattern.templatemethod;

/**
 * @Author:liwy
 * @date: 22.7.17
 * @Version:1.0
 */
public class ItWorker extends Worker {

    private String name;

    public ItWorker(String name) {
        super(name);
        this.name = name;
    }

    @Override
    protected boolean isNeedPrintDate() {
        return true;
    }

    @Override
    public void work() {
        System.out.println(name + "写代码");
    }
}
