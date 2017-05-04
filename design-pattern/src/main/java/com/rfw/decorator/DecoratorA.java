package com.rfw.decorator;

import com.rfw.decorator.interfaces.IComponent;

/**
 * Created by Administrator on 2017/5/4.
 */
public class DecoratorA extends Decorator {

    public DecoratorA(IComponent component) {
        super(component);
    }

    @Override
    public void before() {
        System.out.println("A:before..........");
    }

    @Override
    public void after() {
    }
}
