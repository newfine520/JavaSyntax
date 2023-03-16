package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListToString {
    public void ListToStringTest()
    {
        List<String> strList= Arrays.asList("a","b","c");
        //第一种方法
        //String str=strList.stream().collect(Collectors.joining(","));
        //第二种方法
        String str=String .join(",",strList);



        //比较字符串大小（忽略大小写）
//        if (strA.equalsIgnoreCase(strB)) {
//            System.out.println("相等");
//        }


        //两个list取交集
        List<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        System.out.println(list1);
        List<String> list2 = new ArrayList<>();
        list2.add("a");
        list2.add("b");
        list2.add("d");
        list1.retainAll(list2);
        System.out.println(list1); // 输出[a, b]

    }
}
