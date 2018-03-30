package com.rfw.temp;

import java.util.Date;

/**
 * Created by Administrator on 2017/6/22.
 */
public class ThreadTest {

    final static Object object = new Object();

    public static class T1 extends Thread {

        @Override
        public void run() {
            synchronized (object) {
                try {
                    System.out.println(new Date() + " wait begin");
                    object.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(new Date() + "t1 end");
            }
        }
    }

    public static class T2 extends Thread {
        @Override
        public void run() {
            synchronized (object) {

                System.out.println(new Date() + " notify begin");
                object.notify();
                System.out.println(new Date() + "t2 end");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new T1();
        Thread t2 = new T2();
        t1.start();
        Thread.sleep(100);
        t2.start();
    }

}
