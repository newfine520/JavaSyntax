package com.demo;

import java.util.Arrays;
import java.util.List;

public class ExceptionDemo {
    public  void ExceptionTest()
    {
        List<Integer> integers = Arrays.asList(1,2,3,4,5,0);
        integers.forEach(i -> {
            try {
                System.out.println(1 / i);
            }
            catch (ArithmeticException e)
            {
                System.err.println("Arithmetic Exception occured : " + e.getMessage());
                e.printStackTrace();
            }
        });
    }
}
