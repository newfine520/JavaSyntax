package com.demo;

public class VolatileExample {

    static volatile VolatileExample instance;
//    private volatile static  int x=0,a=0;
//    private volatile static  int y=0,b=0;

//    public static void VolatileTest() throws InterruptedException {
//        int i=0;
//        for(;;) {
//            i++;
//            x=0;y=0;
//            a=0;b=0;
//
//            Thread t1 = new Thread(() -> {
//                a = 1;
//                x = b;
//            });
//            Thread t2 = new Thread(() -> {
//                b = 1;
//                y = a;
//            });
//
//
//            t1.start();
//            t2.start();
//            t1.join();
//            t2.join();
//
//            String result="第"+i+"次("+x+","+y+")";
//            if(x==0&&y==0)
//            {
//                System.out.println(result);
//                break;
//            }
//            else
//            {
//
//            }
//        }
//
//
//    }


    private VolatileExample()
    {

    }

    //单例
    public static VolatileExample getInstance()
    {
        if(instance==null)
        {
            synchronized (VolatileExample.class)
            {
               if(instance==null)
              {
                instance=new VolatileExample();
              }
            }
       }
        return instance;
    }








}
