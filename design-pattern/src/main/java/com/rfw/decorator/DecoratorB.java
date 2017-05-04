package com.rfw.decorator;

import com.rfw.decorator.interfaces.IComponent;

/**
 * Created by Administrator on 2017/5/4.
 */
public class DecoratorB extends Decorator {

    public DecoratorB(IComponent component) {
        super(component);
    }

    @Override
    public void before() {
        System.out.println("B:before..........");
    }

    @Override
    public void after() {
        System.out.println("B:after..........");
    }
}
