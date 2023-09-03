package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
    public  void ArrayListTest()
    {

        //注意：不能在forEach里面修改列表（新增、删除元素）
        //ArrayList和泛型互相转换
        List<String> list=new ArrayList<>();
        if(list.isEmpty())//检测空，代码更易读，性能好,不要使用size方法检测空
        {

        }
        else
        {

        }

        //ArrayList和数组互相转换
        //不建议(通过Arrays.asList(strArray) 方式,将数组转换List后，不能对List增删，只能查改，否则抛异常（原因解析：Arrays.asList(strArray)返回值是java.util.Arrays类中一个私有静态内部类java.util.Arrays.ArrayList，它并非java.util.ArrayList类。java.util.Arrays.ArrayList类具有 set()，get()，contains()等方法，但是不具有添加add()或删除remove()方法,所以调用add()方法会报错。))：
        //List<String> typeList= Arrays.asList("Short","Integer","Long");
        //建议：
        ArrayList<String> typeList = new ArrayList<String>(Arrays.asList("Short","Integer","Long")) ;
        String[] names={"Short","Integer","Long"};
        List<String> nameList=new ArrayList<>();
        nameList.addAll(Arrays.asList(names));



        int userSize=100;
        List<UserDO> userList = new ArrayList<>(userSize);

        //使用JDK提供的方法拷贝集合，效率更高
        List<UserDO> user1List=new ArrayList<>();
        List<UserDO> user2List=new ArrayList<>();
        List<UserDO> userList3=new ArrayList<>(user1List.size()+user2List.size());
        userList3.addAll(user1List);
        user1List.addAll(user2List);

    }
}
