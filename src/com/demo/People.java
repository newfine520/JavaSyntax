package com.demo;

public class People {
    private String name;
    private Integer age;
    public  People(String name,Integer age)
    {
        this.name=name;
        this.age=age;
    }
    public People()
    {

    }
    public String getName()
    {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public Integer getAge()
    {
        return age;
    }
    public void setAge(Integer age)
    {
        this.age=age;
    }
    public void speak()
    {
        System.out.println("讲话");
    }
}
