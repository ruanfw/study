package com.rfw.adapter;

import com.rfw.adapter.interfaces.IAdaptee;
import com.rfw.adapter.interfaces.ITarget;

/**
 * Created by Administrator on 2017/5/4.
 */
public class Client {

    public static void main(String[] args) {
        IAdaptee adaptee = new Adaptee();
        ITarget adapter = new Adapter(adaptee);
        adapter.request();
    }
}
