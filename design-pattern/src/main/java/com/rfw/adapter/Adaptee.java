package com.rfw.adapter;

import com.rfw.adapter.interfaces.IAdaptee;

/**
 * Created by Administrator on 2017/5/4.
 */
public class Adaptee implements IAdaptee {
    @Override
    public void specificRequest() {
        System.out.println("sepcific request");
    }
}
