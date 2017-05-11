package com.rfw.templatemethod;

/**
 * Created by Administrator on 2017/5/11.
 */
public abstract class AbstractClazz {

    protected abstract void templateMethod();

    public void doSomething() {
        System.out.println("doSomething begin..........");

        if (hook()) {
            templateMethod();
        }

        System.out.println("doSomething end...........");
    }

    protected boolean hook() {
        return true;
    }

}
