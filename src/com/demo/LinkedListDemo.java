package com.demo;

import java.util.LinkedList;

public class LinkedListDemo {
    public  void LinkedListTest()
    {
        LinkedList<UserDO> userDOLinkedList=new LinkedList<>();
        for(UserDO userDO:userDOLinkedList)//相比直接get获取，效率高
        {
            //...
        }
    }
}
