package com.demo;

public class Women extends People implements Person{
    @Override
    public int getNumber() {
        return 0;
    }
    @Override
    public void speak()
    {
        System.out.println("英语");
    }
}
