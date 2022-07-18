package com.java.design.behaviourpattern.observer;

import java.util.ArrayList;

/**
 * @Author:liwy
 * @date: 22.7.17
 * @Version:1.0
 */
public class Subject3D implements Subject {
    private ArrayList<Observer> observers = new ArrayList<>();


    private String msg ;


    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(getMsg());
        }
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
        notifyObservers();
    }
}
