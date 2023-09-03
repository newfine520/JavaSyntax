package com.demo.inherit;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InstanceOfDemo {
    public static void main(String[] args) {
        InstancePublishInfo instancePublishInfo = new BatchInstancePublishInfo();
        MyApplicationEvent myApplicationEvent=new MyApplicationEvent(new InstanceOfDemo());
        if (instancePublishInfo instanceof BatchInstancePublishInfo)
        {
            System.out.println("instancePublishInfo instanceof BatchInstancePublishInfo");
        }
        else
        {
            System.out.println("instancePublishInfo not instanceof BatchInstancePublishInfo");
        }

        if(myApplicationEvent instanceof ApplicationEvent)
        {
            System.out.println("myApplicationEvent instanceof ApplicationEvent is true");
        }
        else
        {
            System.out.println("myApplicationEvent instanceof ApplicationEvent is false");
        }
    }
}
