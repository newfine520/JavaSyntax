package com.demo.thread.Synchronized;

public class OShuThread extends Thread{
    int count=0;
    Object object1=null;
    public OShuThread(int currentCount,Object object)
    {
        count=currentCount;
        object1=object;
    }
    @Override
    public void run()
    {
        for(int i=count;i<100;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
                object1.notifyAll();
            }
        }
    }
}
