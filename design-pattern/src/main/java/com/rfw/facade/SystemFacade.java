package com.rfw.facade;

/**
 * Created by Administrator on 2017/4/25.
 */
public class SystemFacade {

    private SubSystemA subSystemA = new SubSystemA();

    private SubSystemB subSystemB = new SubSystemB();

    private SubSystemC subSystemC = new SubSystemC();

    public void method() {
        subSystemA.methodA();
        subSystemB.methodB();
        subSystemC.methodC();
    }

}
