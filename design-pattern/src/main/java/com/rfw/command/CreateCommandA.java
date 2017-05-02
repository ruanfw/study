package com.rfw.command;

import com.rfw.command.interfaces.ICommand;

/**
 * Created by Administrator on 2017/4/20.
 */
public class CreateCommandA implements ICommand {

    ReceiverA receiverA;

    public CreateCommandA(ReceiverA receiverA) {
        this.receiverA = receiverA;
    }

    public void execute() {
        receiverA.doSomething();
    }

    public void undo() {
        System.out.println("command A undo");
    }

}
