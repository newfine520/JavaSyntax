package com.demo.thread;

import java.util.Random;
import java.util.concurrent.*;

public class FutureTestBackup {
    /**
     * <1>异步执行：使用future，主线程中多个任务是异步执行（不用等待一个任务的执行完成，只需要往下执行就行，如果执行完成则可获取结果，如果没有完成则需要等待）。
     * <2>执行结果获取：(1)用Future接口中的isDone()方法判断任务是否执行完，如果执行完成则可获取结果，如果没有完成则需要等待。虽然主线程中多个任务异步执行，但无法确定任务什么时候执行完成，只能通过不断去监听以获取结果，所以这里是阻塞的。(2)在future.get()的地方等待future返回的结果，这时时同步操作。
     */
    public static final ExecutorService service= Executors.newCachedThreadPool();
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        long start =System.currentTimeMillis();

        //任务1
        Future<Boolean> booleanTask=service.submit(new Callable<Boolean>() {
            @Override
            public Boolean call() throws Exception {
                Thread.sleep(10000);
                return true;
            }
        });

        //任务2
        Future<String> stringTask=service.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(3000);
                return "Hello World";
            }
        });

        //任务3
        Future<Integer> integerTask=service.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                Thread.sleep(2000);
                return new Random().nextInt(100);
            }
        });
        int i=0,j=0,k=0;
        while (true)
        {
            i++;
            System.out.println("i:"+i);
            if(booleanTask.isDone()&&!booleanTask.isCancelled())
            {
                Boolean result=booleanTask.get();
                System.err.println("任务1-10s:"+result);
                break;
            }
        }
        while (true)
        {
            j++;
            System.out.println("j:"+j);
            if(stringTask.isDone()&&!stringTask.isCancelled())
            {
                String result=stringTask.get();
                System.err.println("任务2-3s:"+result);
                break;
            }
        }

        while (true)
        {
            k++;
            System.out.println("k:"+k);
            if(integerTask.isDone()&&!integerTask.isCancelled())
            {
                Integer result=integerTask.get();
                System.err.println("任务3-2s:"+result);
                break;
            }
        }

        //执行时间
        //因为我们一开始用 Thread1.get() 获取第一个线程的结果时，是阻塞的，而且我们假定任务1执行了10s钟，导致了线程2（3s就执行完任务）和线程3（2s就执行完任务）都执行完了任务，也不打印出来。
        System.err.println("time:"+(System.currentTimeMillis()-start));
    }
}
