package com.demo.thread.Synchronized;
//测试this
//synchronized（this）锁的是当前对象，this代表了对象锁，此时被synchronized锁住的代码块只在当前对象同步，如果有其他对象就不会同步了
public class Human implements Runnable{
    public void run()
    {
        synchronized (this) {
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
