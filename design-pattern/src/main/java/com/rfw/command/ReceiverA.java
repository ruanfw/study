package com.rfw.command;

import com.rfw.command.interfaces.IReceiver;

/**
 * Created by Administrator on 2017/5/2.
 */
public class ReceiverA implements IReceiver{

    @Override
    public void doSomething() {
        System.out.println("receiver A do something");
    }
}
