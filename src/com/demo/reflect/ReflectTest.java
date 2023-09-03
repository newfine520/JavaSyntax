package com.demo.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectTest {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> aClass = Class.forName("com.demo.reflect.Person");

        //获取非私有化的带参构造方法
        Constructor<?> constructor1 = aClass.getConstructor(int.class, String.class, double.class, double.class);//public com.isg.springboottest.entity.Person(int,java.lang.String,double,double)
        System.out.println(constructor1);
        System.out.println();
        Person person=(Person)constructor1.newInstance(2, "张三", 56.4, 175.5);
        System.out.println(person);
    }
}
