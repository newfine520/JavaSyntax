package com.demo;

import java.util.concurrent.locks.Condition;

public class ThreadWaitNotifyExampleOne extends Thread{
    private Res res;
    Condition newCondition;
    public ThreadWaitNotifyExampleOne(Res res)
    {
        this.res=res;
    }
    public ThreadWaitNotifyExampleOne(Res res,Condition newCondition)
    {
        this.res=res;
        this.newCondition=newCondition;
    }

    //不加锁
//    @Override
//    public void run()
//    {
//        int count=0;
//        while (true)
//        {
//            if(count==0)
//            {
//                res.setUserName("张三");
//                res.setUserSex("男");
//            }
//            else
//            {
//                res.setUserName("红红");
//              res.setUserSex("女");
//            }
//            count=(count+1)%2;
//        }
//    }



    //加锁(synchronized)
//    @Override
//    public void run()
//    {
//        int count=0;
//        //while (true)
//        for(int index=0;index<1000;index++)
//        {
//            synchronized (res) {
//                if (count == 0) {
//                    res.setUserName("张三");
//                    res.setUserSex("男");
//                } else {
//                    res.setUserName("红红");
//                    res.setUserSex("女");
//                }
//                count = (count + 1) % 2;
//            }
//        }
//    }

    //线程通讯 wait notify
    @Override
    public void run()
    {
        int count=0;
        //while (true)
        for(int index=0;index<10;index++)
        {
            synchronized (res)
            {
                if(res.getFlag())
                {
                    try
                    {
                        //当前线程变为等待，但是可以释放锁
                        res.wait();
                    }
                    catch (Exception e)
                    {

                    }
                }
                if(count==0)
                {
                    res.setUserName("张三");
                    res.setUserSex("男");
                }
                else
                {
                    res.setUserName("红红");
                    res.setUserSex("女");
                }
                count=(count+1)%2;
                res.setFlag(true);
                //唤醒当前线程
                res.notify();
            }
        }
    }

}
