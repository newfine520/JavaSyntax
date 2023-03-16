package com.demo;

import org.omg.CORBA.TIMEOUT;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class ThreadDemo1 {
    static int x = 0, y = 0;
    static int a = 0, b = 0;
    private static volatile int count = 0;
    private static volatile  boolean flag=true;
    public void ThreadTest1() throws InterruptedException {
        Set<String> aa = new HashSet<>();
        for (int i = 0; i < 10000000; i++) {
            x = 0;
            y = 0;
            a = 0;
            b = 0;
            Thread one = new Thread(() -> {
                a = y;
                x = a;
            });
            Thread other = new Thread(() -> {
                b = x;
                y = 1;
            });
            one.start();
            other.start();
            one.join();
            other.join();
            aa.add("a=" + a + "b=" + b);
            System.out.println(aa);
        }
    }

    public void ThreadAutomicTest() {
        Object lock = new Object();
        for (int i = 0; i < 5; i++) {
            Thread a = new Thread() {
                public void run() {
                    synchronized (lock) {
                        for (int i = 0; i < 2; i++) {
                            count++;
                            System.out.println(count + (count != 10 ? "," : ""));
                        }
                        lock.notifyAll();
                    }

                }
            };
            a.start();
        }
    }

    public void ThreadSynchronizedTest()
    {
        Object lock = new Object();
        for(int i=1;i<=99;i++)
        {
            //每个线程一个编号
            int num=i;
            Thread thread=new Thread(new Runnable() {
                @Override
                public void run() {
                    try{
                        synchronized (lock)
                        {
                            while (count!=num)
                            {
                                lock.wait();
                            }
                            System.out.println(Thread.currentThread().getName()+":"+num);
                            count++;
                            lock.notifyAll();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            },"thread-"+num);
            thread.start();
        }
        synchronized (lock)
        {
           count++;
           lock.notifyAll();
        }
    }
    public void ThreadInterruptTest() {

        Thread A=new Thread(){
            public  void run()
            {
               while (flag)
               {
                   System.out.println("doTask");
               }
            }
        };
        Thread B=new Thread(){
            public  void run()
            {
                try {
                    TimeUnit.SECONDS.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
             flag=false;
            }
        };
        A.start();
        B.start();
    }


}
