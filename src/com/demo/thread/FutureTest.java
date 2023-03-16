package com.demo.thread;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.Random;
import java.util.concurrent.*;

public class FutureTest {
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
        System.err.println("time:"+(System.currentTimeMillis()-start));
    }
}
