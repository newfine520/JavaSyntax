package com.demo;

public class ThreadWaitNotifyExampleTwo extends Thread {
    private Res res;
    public ThreadWaitNotifyExampleTwo(Res res)
    {
        this.res=res;
    }

    //不加锁
//    @Override
//    public void run()
//    {
//        while (true)
//        {
//            System.out.println(res.getUserName()+"-"+res.getUserSex());
//        }
//    }





//    //加锁(synchronized)
    @Override
    public void run()
    {
        //while (true)
        for(int index=0;index<1000;index++)
        {
            synchronized (res) {
                System.out.println(res.getUserName() + "-" + res.getUserSex());
            }
        }
    }


    //线程通讯 wait notify
//    @Override
//    public void run()
//    {
//        //while (true)
//        for(int index=0;index<10;index++)
//        {
//            synchronized (res)
//            {
//                if(!res.getFlag())
//                {
//                    try
//                    {
//                        res.wait();
//                    }
//                    catch (Exception e)
//                    {
//
//                    }
//                }
//                System.out.println(res.getUserName() + "-" + res.getUserSex());
//                res.setFlag(false);
//                res.notify();
//            }
//        }
//    }
}
