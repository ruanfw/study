package com.rfw.observer;

import com.rfw.observer.interfaces.IObserver;
import com.rfw.observer.interfaces.ISubject;

/**
 * Created by Administrator on 2017/5/4.
 */
public class Client {
    public static void main(String[] args) {
        IObserver observerA = new ConcreteObserverA();
        IObserver observerB = new ConcreteObserverB();
        IObserver observerC = new ConcreteObserverC();

        ISubject subject = new ConcreteSubject();
        subject.registObserver(observerA);
        subject.registObserver(observerB);
        subject.registObserver(observerC);

        subject.notifyObserver("hello world");

        subject.removeObserver(observerB);
        subject.notifyObserver("hello world again");

    }
}
