package com.rfw.templatemethod;

/**
 * Created by Administrator on 2017/5/11.
 */
public class Client {

    public static void main(String[] args) {
        AbstractClazz concreteClazzA = new ConcreteClazzA();
        concreteClazzA.doSomething();

        System.out.println("");

        AbstractClazz concreteClazzB = new ConcreteClazzB();
        concreteClazzB.doSomething();
    }


}
