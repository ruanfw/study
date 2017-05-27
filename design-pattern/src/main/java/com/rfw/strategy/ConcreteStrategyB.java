package com.rfw.strategy;

import com.rfw.strategy.interfaces.IStrategy;

/**
 * Created by Administrator on 2017/5/27.
 */
public class ConcreteStrategyB implements IStrategy{

    @Override
    public void strategyInterface() {
        System.out.println("this is strategy B");
    }
}
