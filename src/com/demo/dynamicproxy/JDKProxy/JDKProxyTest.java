package com.demo.dynamicproxy.JDKProxy;

import java.lang.reflect.Proxy;

public class JDKProxyTest {
    public static void main(String[] args) {
        JayServiceImpl jayService=new JayServiceImpl();
        JayServiceProxy proxy=new JayServiceProxy(jayService);
        ClassLoader classLoader=jayService.getClass().getClassLoader();
        System.err.println(classLoader);

        JayService jayService1=(JayService) Proxy.newProxyInstance(jayService.getClass().getClassLoader(),jayService.getClass().getInterfaces(),proxy);
        jayService1.sing();
    }
}
