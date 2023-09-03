package com.demo.thread.Synchronized;

//synchronized(this)和synchronized(.class)区别
//synchronized(this):对象锁只对当前对象加锁：锁的是当前对象，this代表了对象锁，此时被synchronized锁住的代码块只在当前对象同步，如果有其他对象就不会同步了
//synchronized(.class):类锁是对指定类加锁
public class SynchronizedTest {
    public static void main(String[] args) {
        Human human=new Human();
        //同一对象new出来的thread,受this锁会同步
        Thread human1=new Thread(human,"苇名一心1");
        Thread human2=new Thread(human,"苇名一心2");
        human1.start();
        human2.start();
        //查看输出结果可以看到同一对象创建出来的Thread是一个线程被锁住的代码块执行完后，才执行另一个线程被锁住的代码块，实现了同步



//        Human you=new Human();
//        Human he=new Human();
//        //不通对象new出来的thread，不会同步
//        Thread you1=new Thread(you,"苇名一心");
//        Thread he1=new Thread(he,"苇名弦一郎");
//
//        you1.start();
//        he1.start();
        //由于this锁是锁住的当前对象，对于用不同对象new出来的Thread，不会受this锁的影响，也就不会实现同步。


        Animal animal1=new Animal();
        Animal animal2=new Animal();
        //不同对象，在类锁下会同步
        Thread animal11=new Thread(animal1,"苇名一心");
        Thread animal22=new Thread(animal1,"苇名弦一郎");

        animal11.start();
        animal22.start();

        //多次测试后发现可以实现同步。

    }

}
