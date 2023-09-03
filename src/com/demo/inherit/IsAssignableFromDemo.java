package com.demo.inherit;

import org.springframework.core.ResolvableType;

public class IsAssignableFromDemo {

    public static void main(String[] args) {
        ResolvableType type = ResolvableType.forRawClass(ExtendsList.class);
        if(type.isAssignableFrom(ExtendsList.class))
        {
            System.out.println("type is isAssignableFrom ExtendsList.class");
        }
        else
        {
            System.out.println("type is not isAssignableFrom ExtendsList.class");
        }
    }
}
