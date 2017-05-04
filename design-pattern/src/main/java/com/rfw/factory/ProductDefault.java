package com.rfw.factory;

import com.rfw.factory.interfaces.IProduct;

/**
 * Created by Administrator on 2017/5/4.
 */
public class ProductDefault implements IProduct {
    @Override
    public void create() {
        System.out.println("product default created");
    }
}
