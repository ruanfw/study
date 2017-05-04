package com.rfw.observer;

import com.rfw.observer.interfaces.IObserver;
import com.rfw.observer.interfaces.ISubject;

/**
 * Created by Administrator on 2017/5/4.
 */
public class ConcreteObserverA implements IObserver {

    @Override
    public void update(String content) {
        System.out.println("A: " +content);
    }
}
