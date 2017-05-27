package com.rfw.strategy;

import com.rfw.strategy.interfaces.IStrategy;

/**
 * Created by Administrator on 2017/5/27.
 */
public class Context {

    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void contextInterface(){
        strategy.strategyInterface();
    }
}
