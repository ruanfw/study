package com.rfw.disruptor;

import com.lmax.disruptor.WorkHandler;

/**
 * Created by Administrator on 2017/6/27.
 */
public class Consumer implements WorkHandler<PCData> {

    @Override
    public void onEvent(PCData event) throws Exception {
        Thread.sleep(1000L);
        System.out.println("Event:--" + event.getValue() + "--");
    }
}
