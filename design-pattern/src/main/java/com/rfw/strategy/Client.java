package com.rfw.strategy;

import com.rfw.strategy.interfaces.IStrategy;

/**
 * Created by Administrator on 2017/5/27.
 */
public class Client {

    public static void main(String[] args) {
        IStrategy strategy = new ConcreteStrategyA();
        Context context = new Context(strategy);
        context.contextInterface();
    }
}
