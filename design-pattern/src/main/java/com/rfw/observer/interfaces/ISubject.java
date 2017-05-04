package com.rfw.observer.interfaces;

/**
 * Created by Administrator on 2017/5/4.
 */
public interface ISubject {
    void registObserver(IObserver observer);

    void removeObserver(IObserver observer);

    void notifyObserver(String content);

}
