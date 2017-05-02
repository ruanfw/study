package com.rfw.command;

import com.rfw.command.interfaces.ICommand;

/**
 * Created by Administrator on 2017/5/2.
 */
public class Client {

    public static void main(String[] args) {

        Invoker invoker = new Invoker();

        ICommand commandA = new CreateCommandA(new ReceiverA());
        ICommand commandB = new CreateCommandB(new ReceiverB());

        invoker.setCommand(commandA).action();
        invoker.setCommand(commandB).action();

    }
}
