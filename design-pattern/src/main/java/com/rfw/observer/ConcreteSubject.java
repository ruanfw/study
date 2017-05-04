package com.rfw.observer;

import com.google.common.collect.Lists;
import com.rfw.observer.interfaces.IObserver;
import com.rfw.observer.interfaces.ISubject;

import java.util.List;

/**
 * Created by Administrator on 2017/5/4.
 */
public class ConcreteSubject implements ISubject {

    private List<IObserver> observers = Lists.newArrayList();

    @Override
    public void registObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(String content) {
        for (IObserver observer : observers) {
            observer.update(content);
        }
    }
}
