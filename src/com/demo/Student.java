package com.demo;

public class Student{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRealName()
    {
        return realName;
    }

    public void setRealName(String realName)
    {
        this.realName=realName;
    }


    private String name;
    private int age;
    private String realName;

    public String toString()
    {
        return "{\"name\":\""+name+"\",\"age\":"+age+"}";
    }
}
