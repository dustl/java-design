package com.java.design.behaviourpattern.templatemethod;

/**
 * @Author:liwy
 * @date: 22.7.17
 * @Version:1.0
 */
public class Main {


    public static void main(String[] args) {
        ItWorker itWorker = new ItWorker("小黄");
        itWorker.workOneDay();
        HrWorker hrWorker = new HrWorker("小然");
        hrWorker.workOneDay();

    }
}
