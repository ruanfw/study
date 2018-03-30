package com.rfw.akka;

import akka.actor.UntypedActor;

/**
 * Created by Administrator on 2017/7/2.
 */
public class Greeter extends UntypedActor {

    public enum Msg {
        GREET, DONE
    }

    @Override
    public void onReceive(Object msg) throws Throwable {

        if (msg == Msg.GREET) {
            System.out.println("hello world!");
            getSender().tell(Msg.DONE, getSelf());
        } else {
            unhandled(msg);
        }

    }
}
