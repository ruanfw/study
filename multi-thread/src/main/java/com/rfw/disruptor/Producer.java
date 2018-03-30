package com.rfw.disruptor;

import com.lmax.disruptor.RingBuffer;

import java.nio.ByteBuffer;

/**
 * Created by Administrator on 2017/6/27.
 */
public class Producer {

    private final RingBuffer<PCData> ringBuffer;

    public Producer(RingBuffer<PCData> ringBuffer) {
        this.ringBuffer = ringBuffer;
    }

    public void pushData(ByteBuffer bb) {
        long sequence = ringBuffer.next();

        try {
            PCData event = ringBuffer.get(sequence);
            event.setValue(bb.getLong(0));
        }finally{
            ringBuffer.publish(sequence);
        }

    }

}
