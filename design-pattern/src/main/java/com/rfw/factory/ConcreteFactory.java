package com.rfw.factory;

import com.rfw.factory.interfaces.IFactory;
import com.rfw.factory.interfaces.IProduct;

/**
 * Created by Administrator on 2017/5/4.
 */
public class ConcreteFactory implements IFactory {

    @Override
    public IProduct createProduct(String name) {
        if (name.equals("A")) {
            return new ProductA();
        }
        if (name.equals("B")) {
            return new ProductB();
        }
        return new ProductDefault();
    }
}
