package com.java.design.behaviourpattern.templatemethod;

/**
 * @Author:liwy
 * @date: 22.7.17
 * @Version:1.0
 */
public class HrWorker extends Worker {

    public HrWorker(String name) {
        super(name);
    }


    @Override
    public void work() {
        System.out.println(name + " 看简历,打电话");
    }
}
