package com.demo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {
    static Lock lock=new ReentrantLock();
    private static int count=0;
    public static void inc()
    {
        lock.lock();//抢占锁  //如果没有抢占到锁会阻塞
//        if(lock.tryLock())//
//        {
//
//        }
        try {
            Thread.sleep(1);
            count++;
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }
        }

    public static void main(String[] args) throws InterruptedException {
        for(int i=0;i<1000;i++)
        {
            new Thread(()->LockExample.inc()).start();
        }
        Thread.sleep(3000);
        System.out.println("result:"+count);
    }
}
