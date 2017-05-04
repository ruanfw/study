package com.rfw.observer;

import com.rfw.observer.interfaces.IObserver;

/**
 * Created by Administrator on 2017/5/4.
 */
public class ConcreteObserverB implements IObserver {

    @Override
    public void update(String content) {
        System.out.println("B: " +content);
    }
}
