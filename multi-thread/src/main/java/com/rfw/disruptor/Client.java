package com.rfw.disruptor;

import com.lmax.disruptor.BlockingWaitStrategy;
import com.lmax.disruptor.RingBuffer;
import com.lmax.disruptor.dsl.Disruptor;
import com.lmax.disruptor.dsl.ProducerType;

import java.nio.ByteBuffer;
import java.util.concurrent.ThreadFactory;

/**
 * Created by Administrator on 2017/6/27.
 */
public class Client {

    public static void main(String[] args) throws InterruptedException {

//        ExecutorService exe = Executors.newCachedThreadPool();

        ThreadFactory threadFactory = new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread thread = new Thread(r);
                System.out.println("create new thread");
                return thread;
            }
        };

        PCDataFactory pcDataFactory = new PCDataFactory();

        int ringBufferSize = 4;

        Disruptor<PCData> disruptor = new Disruptor<>(pcDataFactory, ringBufferSize, threadFactory
                , ProducerType.MULTI, new BlockingWaitStrategy());

        disruptor.handleEventsWithWorkerPool(new Consumer());

        disruptor.start();

        RingBuffer<PCData> ringBuffer = disruptor.getRingBuffer();
        Producer producer = new Producer(ringBuffer);
        ByteBuffer bb = ByteBuffer.allocate(8);

        for (long i = 0; ; i++) {
            System.out.println("add data:" + i);
            bb.putLong(0, i);
            producer.pushData(bb);
        }
    }

}
