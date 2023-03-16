package com.demo;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class ConditionDemoNotify implements Runnable{
    private Lock lock;
    private Condition condition;


    public ConditionDemoNotify(Lock lock, Condition condition)
    {
        this.lock=lock;
        this.condition=condition;
    }

    @Override
    public void run(){
        System.out.println("begin-ConditionDemoNotify");
        lock.lock();
        try {
            condition.signal();//让当前线程阻塞 Object.notify();//
            System.out.println("end-ConditionDemoNotify");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        lock.unlock();
    }
}
