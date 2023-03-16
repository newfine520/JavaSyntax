package com.demo;

import java.util.Arrays;
import java.util.List;

public class ListDemo {
    public void ListTest()
    {
        List<Integer> integerList= Arrays.asList(1,2,3,4,5);
        Integer[] integers=integerList.toArray(new Integer[0]);

        for(int i=0;i<integers.length;i++)
        {
            System.out.println(integers[i]);
        }
    }
}
