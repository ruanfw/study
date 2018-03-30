package com.rfw.disruptor;

import com.lmax.disruptor.EventFactory;

/**
 * Created by Administrator on 2017/6/27.
 */
public class PCDataFactory implements EventFactory<PCData> {
    @Override
    public PCData newInstance() {
        return new PCData();
    }
}
