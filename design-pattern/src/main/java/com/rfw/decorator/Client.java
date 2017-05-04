package com.rfw.decorator;

import com.rfw.decorator.interfaces.IComponent;

/**
 * Created by Administrator on 2017/5/4.
 */
public class Client {

    public static void main(String[] args) {
        IComponent component = new ConcreteComponent();

        Decorator decoratorA = new DecoratorA(component);
        Decorator decoratorB = new DecoratorB(component);

        decoratorA.doSomething();
        System.out.println("");
        decoratorB.doSomething();
        System.out.println("");

        decoratorA = new DecoratorA(decoratorB);
        decoratorA.doSomething();
        System.out.println("");
    }

}
