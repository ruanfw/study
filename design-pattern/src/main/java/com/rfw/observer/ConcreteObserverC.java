package com.rfw.observer;

import com.rfw.observer.interfaces.IObserver;

/**
 * Created by Administrator on 2017/5/4.
 */
public class ConcreteObserverC implements IObserver {

    @Override
    public void update(String content) {
        System.out.println("C: " +content);
    }
}
