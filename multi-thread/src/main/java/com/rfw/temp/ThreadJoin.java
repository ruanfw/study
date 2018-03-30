package com.rfw.temp;

/**
 * Created by Administrator on 2017/6/22.
 */
public class ThreadJoin {

    public static volatile int i = 0;

    public static class T1 extends Thread {
        @Override
        public void run() {
            for (; i < 100000; i++) ;

            System.out.println("t1 end");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new T1();

        t1.start();
        t1.join();
        System.out.println("main thread end, i:" + i);
    }

}
