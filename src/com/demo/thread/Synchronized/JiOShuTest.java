package com.demo.thread.Synchronized;

public class JiOShuTest {
    static boolean flag=true;
    static volatile  int i=0;
    public static void main(String[] args) {
        //两个线程交替打印奇偶数
        new Thread(()->{
           while (true)
           {
               if(flag)
               {
                   System.out.println(Thread.currentThread().getName()+":"+(i++));
                   flag=false;
               }
               if(i>100)
               {
                   break;
               }
           }
        }).start();
        new Thread(()->{
            while (true)
            {
                if(!flag)
                {
                    System.out.println(Thread.currentThread().getName()+":"+(i++));
                    flag=true;
                }
                if(i>100)
                {
                break;
                }
            }
        }).start();
    }

}
