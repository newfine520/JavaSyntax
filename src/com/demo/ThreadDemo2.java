package com.demo;

public class ThreadDemo2 implements Runnable {
    //静态变量：共享资源（临界资源）
    static int i=0;
    public void run()
    {

        for(int j=0;j<10000;j++)
        {
            increase1();
        }
    }
    public synchronized void increase1()
    {
        i++;
    }
    public void ThreadDemo2Test1() throws InterruptedException {
        ThreadDemo2 t=new ThreadDemo2();
        Thread t1=new Thread(t);
        Thread t2=new Thread(t);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(i);
    }


    public static synchronized void increase2()
    {
        i++;
    }
    public  void ThreadDemo2Test2() throws InterruptedException {
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int j=0;j<10000;j++)
                {
                    increase2();
                }
            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int j=0;j<10000;j++)
                {
                    increase2();
                }
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(i);
    }
}
