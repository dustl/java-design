package com.java.design.behaviourpattern.observer;

/**
 * @Author:liwy
 * @date: 22.7.17
 * @Version:1.0
 */
public class Main {

    public static void main(String[] args) {
        Subject3D subject = new Subject3D();
        ObserverUser1 observerUser1 = new ObserverUser1(subject);
        ObserverUser2 observerUser2 = new ObserverUser2(subject);
        subject.setMsg("hello");
        subject.removeObserver(observerUser1);
        subject.setMsg("hello2");
    }
}
