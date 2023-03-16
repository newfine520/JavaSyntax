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
        List<String> typeList= Arrays.asList("Short","Integer","Long");
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
