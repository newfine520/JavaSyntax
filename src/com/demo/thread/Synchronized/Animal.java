package com.demo.thread.Synchronized;
//测试.class
//.class是一个类锁，对整个类进行加锁。在this的基础上还可以对同一类的不同对象进行同步。
public class Animal implements Runnable {
    public void run()
    {
        synchronized (Animal.class) {
            for (int i = 0; i <= 100; i++)
            {
                try
                {
                    Thread.sleep(200);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"放巴之雷");
            }
        }
    }
}
