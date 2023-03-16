package com.demo;

import java.util.*;

public class HashMapDemo<userDoList> {

    //面试题 1.HashMap如何进行扩容？
    //table 数组大小是由 capacity 这个参数确定的，默认是16，也可以构造时传入，最大限制是1loadFactor 是装载因子，主要目的是用来确认table 数组是否需要动态扩展，默认值是0.75，比如table 数组大小为 16，装载因子为 0.75 时，threshold 就是12，当 table 的实际大小超过 12 时，table就需要动态扩容；
    //扩容时，调用 resize() 方法，将 table 长度变为原来的两倍，并且根据新的容量，计算新的数据索引值

    //2.HashMap 1.8之前之后的区别，为什么链表要转红黑树，什么时候红黑树转链表，以及为什么？
    //1.8之前：
    //底层数据结构采用的是数组+链表，在扩容和put方法调用时会出现线程不安全的问题，put调用会导致数据丢失；扩容采用的是头插法，因为头插法会导致死循环的问题。
    //1.8之后：
    //底层数据结构采用的是数组+链表+红黑树，在put方法调用时会出现线程不安全的问题，put调用会导致数据丢失，但是扩容在1.8之后采用的是尾插法，这样避免了死循环的出现。
    //链表转红黑树是为了提升性能，当元素个数小于一个阈值时，链表整体的插入查询效率要高于红黑树，当元素个数大于此阈值时，链表整体的插入查询效率要低于红黑树。此阈值在HashMap中为8；链表转红黑树的条件是链表的长度大于8且数组的长度大于64时才会转为红黑树；当红黑树长度小于6则转成链表。
    public  void HashMapTest()
    {
    List<UserDO> userDoList=new ArrayList<>();
    int userSize=userDoList.size();
    Map<Integer,UserDO> userMap=new HashMap<>((int)Math.ceil(userSize*4.0/3));




       for (UserDO userDo:userDoList)
      {
        userMap.put(userDo.getId(),userDo);
      }


       Map<Integer,UserDO> userDOMap=new HashMap<>();
       if(userDOMap.isEmpty())//检测空，代码更易读，性能好
       {

       }
       else
       {
       for(Map.Entry<Integer,UserDO> userDOEntry:userDOMap.entrySet())
       {
           Integer userId=userDOEntry.getKey();
           UserDO user=userDOEntry.getValue();
       }
       }
    }
}
