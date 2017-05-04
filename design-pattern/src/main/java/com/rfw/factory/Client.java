package com.rfw.factory;

import com.rfw.factory.interfaces.IFactory;
import com.rfw.factory.interfaces.IProduct;

/**
 * Created by Administrator on 2017/5/4.
 */
public class Client {

    public static void main(String[] args) {
        IFactory factory = new ConcreteFactory();
        IProduct productA = factory.createProduct("A");
        IProduct productB = factory.createProduct("B");
        IProduct productC = factory.createProduct("C");

        productA.create();
        productB.create();
        productC.create();
    }

}
