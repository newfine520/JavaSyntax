package com.demo;

public class ThreadDemo5 {
    public static void main(String[] args) {
        new NewThread();//Thread[My Thread,5,main]
    }
}
class NewThread extends Thread{
    NewThread(){
        super("My Thread");
        start();
    }
    public void run()
    {
        System.out.println(this);
    }
}
