package com.rfw.command;

import com.rfw.command.interfaces.ICommand;

/**
 * Created by Administrator on 2017/4/20.
 */
public class CreateCommandB implements ICommand {

    ReceiverB receiverB;

    public CreateCommandB(ReceiverB receiverB) {
        this.receiverB = receiverB;
    }

    public void execute() {
        receiverB.doSomething();
    }

    public void undo() {
        System.out.println("command B undo");
    }

}
