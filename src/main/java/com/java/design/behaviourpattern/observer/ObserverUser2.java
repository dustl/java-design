package com.java.design.behaviourpattern.observer;

/**
 * @Author:liwy
 * @date: 22.7.17
 * @Version:1.0
 */
public class ObserverUser2 implements Observer {


    public ObserverUser2(Subject subject) {
        subject.registerObserver(this);
    }


    @Override
    public void update(String msg) {
        System.out.println("user2 收到改变的消息:"+msg);
    }
}
