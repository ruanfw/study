package com.rfw.decorator;

import com.rfw.decorator.interfaces.IComponent;

/**
 * Created by Administrator on 2017/5/4.
 */
public class ConcreteComponent implements IComponent{

    @Override
    public void doSomething() {
        System.out.println("doing...");
    }

}
