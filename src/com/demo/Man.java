package com.demo;

public class Man extends People implements Person {

    @Override
    public int getNumber() {
        return 1;
    }
    @Override
    public void speak()
    {
        System.out.println("讲汉语");
    }
}
