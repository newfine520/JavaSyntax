package com.demo;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadDemo3 implements Runnable {
    static int i=0;
    @Override
    public void run()
    {
        for(int j=0;j<10000;j++)
        {
            synchronized (String.class)
            {
                i++;
            }
        }
    }
    public void ThreadDemo3Test1() throws InterruptedException {
        ThreadDemo3 t=new ThreadDemo3();
        Thread t1=new Thread(t);
        Thread t2=new Thread(t);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(i);
    }



    public static int count = 0;
    public static int getCount()
    {
        return count;
    }
    public synchronized static void addCount()
    {
        count++;
    }
    //    public static void addCount()
//    {
//        // 上锁
//        Lock writeLock = Locker.INSTANCE.writeLock();writeLock.lock();
//        count++;
//        // 释放锁
//        writeLock.unlock();
//    }
    //https://p3-sign.toutiaoimg.com/pgc-image/690e0f6157ff40ed8a942d9924a3e150~noop.image?_iz=58558&from=article.pc_detail&x-expires=1659950856&x-signature=LR4kholNGmzMeUOYA45zp3hKZDk%3D
    public static void threadPool() {
        ExecutorService executorService = new ThreadPoolExecutor(10, 1000, 60L, TimeUnit.SECONDS,
                new ArrayBlockingQueue<Runnable>(10));
        for (int i = 0; i < 1000; i++) {
            Runnable r = new Runnable() {
                @Override
                public void run() {
                    ThreadDemo3.addCount();
                }
            };
            executorService.execute(r);
        }
        executorService.shutdown();
        System.out.println(ThreadDemo3.count);
    }

}
