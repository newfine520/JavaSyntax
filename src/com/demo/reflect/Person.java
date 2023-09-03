package com.demo.reflect;

public class Person {
    //私有化的成员属性
    private int id;
    private String name;

    //公开的成员属性
    public double weight;
    public double height;

    //公开的空参构造方法
    public Person(){

    }
    //公开的全参构造方法
    public Person(int id,String name,double weight,double height){
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.height = height;
    }
    //私有的带参构造方法
    private Person(int id,String name){
        this.id = id;
        this.name = name;
    }
    private Person(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person { id = "+id + ", name = " + name
                +", weight = " + weight + ", height = " + height + " }";
    }
}
