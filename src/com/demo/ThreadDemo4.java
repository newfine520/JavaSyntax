package com.demo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo4 extends Thread{
    public static ExecutorService threadpool= Executors.newFixedThreadPool(16);
    public static SimpleDateFormat simpleDateFormat=new SimpleDateFormat("mm:ss");
    public static ThreadLocal<SimpleDateFormat> dateFormatThreadLocal=ThreadLocal.withInitial(()->new SimpleDateFormat("mm:ss"));
    public static int n=1;
    public ThreadDemo4(int seconds)
    {
        n=seconds;
    }
    public void run()
    {
        try {
            sleep(n);
            System.out.println(n+1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //输出500、501、501
    public static void main(String[] args) {
        ThreadDemo4 t1=new ThreadDemo4(1500);
        ThreadDemo4 t2=new ThreadDemo4(500);
        t1.start();
        t2.start();
        System.out.println(n);


        System.out.println("*********************************");

//****************************************************************
        /**
         * ThreadLocal出现背景：ThreadLocal只是并发编程中的一个工具类而已，线程要理解成一个独立的人，用多个人去处理同一个变量，
         * 会存在安全问题（原子性、可见性、有序性问题）
         * ThreadLocal就是为了做线程隔离的
         * 仅仅只是为了在人（线程）身上加一个口袋（数据结构：数组、Hash树、数。。。）而已
         *
         * 使用流程非常简单：
         * （1）创建对象 ThreadLocal<Integer> girl=new ThreadLocal(){
         * @Override
         * protected Integer initialValue()
         * {
         *     return 0;
         * }}
         * (2)
         * 调用对象.set
         *girl.set(18)
         *
         * (3)
         * 调用对象.get
         * girl.get()
         *
         *ThreadLocal源码解析
         * （1）创建对象
         * （2）
         *
         *
         *
         *
         *
         *
         */

//        for(int i=0;i<10;i++)
//        {
//            int s=i;
//            new Thread(()->{
//
//            })
//        }

        //第2个版本（new可以解决：段位不够，不到高级水平）
//        for(int i=0;i<1000;i++)
//        {
//            int s=i;
//            threadpool.submit(()->{
//                SimpleDateFormat simpleDateFormat=new SimpleDateFormat("mm:ss");
//                        Date date=new Date(1000*s);
//                        String data=simpleDateFormat.format(date);
//                        System.out.println(data);
//            });
//        }
//        threadpool.shutdown();


        //第3个版本
//        for(int i=0;i<1000;i++)
//        {
//            int s=i;
//            threadpool.submit(()->{
//                Date date=new Date(1000*s);
//                String data=simpleDateFormat.format(date);
//                System.out.println(data);
//            });
//        }
//        threadpool.shutdown();

        //第4个版本
//        for(int i=0;i<1000;i++)
//        {
//            int s=i;
//            threadpool.submit(()->{
//                Date date=new Date(1000*s);
//                SimpleDateFormat dateFormat=dateFormatThreadLocal.get();
//                String data=dateFormat.format(date);
//                System.out.println(data);
//            });
//        }



        //*************************************************
        //ThreadLocal

        //**************************************************
        /**
         * java中存在四种引用类型：
         * （1）强引用 Object obj=new Object();说白了就是引用指向new关键字创建的对象，特性就是即使内存
         * 溢出，也不会回收强引用
         * （2）软引用：特点：内存如果还够用就不回收，如果不够用了就会回收
         * （3）弱引用：不管内存够不够用，一旦触发垃圾回收,就会将弱引用指向的对象回收
         * （4）虚引用：
         *
         */

    }
}
