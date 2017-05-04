package com.rfw.decorator;

import com.rfw.decorator.interfaces.IComponent;

/**
 * Created by Administrator on 2017/5/4.
 */
public class Decorator implements IComponent {

    IComponent component;

    public Decorator(IComponent component) {
        this.component = component;
    }

    public void before() {
    }

    @Override
    public void doSomething() {
        newDoSomething();
    }

    public void newDoSomething() {
        before();
        component.doSomething();
        after();
    }

    public void after() {
    }
}
