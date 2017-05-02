package com.rfw.command;

import com.rfw.command.interfaces.ICommand;

/**
 * 调用者，负责将具体的命令传送给具体的接收者
 * <p>
 * Created by Administrator on 2017/5/2.
 */
public class Invoker {

    private ICommand command;

    public Invoker setCommand(ICommand command) {
        this.command = command;
        return this;
    }

    public void action() {
        command.execute();
    }

}
