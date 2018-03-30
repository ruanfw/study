package com.rfw.temp;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * Created by Administrator on 2017/6/22.
 */
public class SemapDemo implements Runnable {

    final Semaphore semp = new Semaphore(5);

    @Override
    public void run() {
        try {
            semp.acquire();
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getId() + ":done");
            semp.release();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ExecutorService exe = Executors.newFixedThreadPool(20);
        final SemapDemo demo = new SemapDemo();

        for (int i = 0; i < 20; i++) {
            exe.submit(demo);
        }
        exe.shutdown();
    }
}
