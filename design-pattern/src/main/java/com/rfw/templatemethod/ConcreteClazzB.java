package com.rfw.templatemethod;

/**
 * Created by Administrator on 2017/5/11.
 */
public class ConcreteClazzB extends AbstractClazz {

    @Override
    protected void templateMethod() {
        System.out.println("this is concrete B");
    }

    @Override
    protected boolean hook() {
        return false;
    }
}
