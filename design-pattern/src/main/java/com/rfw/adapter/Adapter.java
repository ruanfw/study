package com.rfw.adapter;

import com.rfw.adapter.interfaces.IAdaptee;
import com.rfw.adapter.interfaces.ITarget;

/**
 * Created by Administrator on 2017/5/4.
 */
public class Adapter implements ITarget {

    private IAdaptee adaptee;

    public Adapter(IAdaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        for (int i = 0; i < 3; i++) {
            adaptee.specificRequest();
        }
    }
}
