package com.demo.referencedemo;

import java.lang.ref.SoftReference;

public class SoftRefrenceDemo {
    public static void main(String[] args) throws InterruptedException {
        Object b=new Object();
        SoftReference sr=new SoftReference(b);//此时sr是软引用
        b=null;
        System.gc();
        Thread.sleep(1000);
    }
}
