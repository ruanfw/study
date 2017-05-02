package com.rfw.command;

import com.rfw.command.interfaces.IReceiver;

/**
 * Created by Administrator on 2017/5/2.
 */
public class ReceiverB implements IReceiver{

    @Override
    public void doSomething() {
        System.out.println("receiver B do something");
    }
}
