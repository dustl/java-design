package com.java.design.behaviourpattern.observer;

/**
 * @Author:liwy
 * @date: 22.7.17
 * @Version:1.0
 */
public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();


}
