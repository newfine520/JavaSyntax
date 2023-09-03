package com.demo.dynamicproxy.CGLIBProxy;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class JayServiceCglibProxy implements MethodInterceptor {

    //增强的设置，通过增强来创建代理类
    Enhancer enhancer=new Enhancer();

    public Object getProxyClass(Class cls)
    {
        enhancer.setSuperclass(cls);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
          System.err.println("1、周杰伦买机票");
          System.err.println("2、送周杰伦到机场");
          Object o1=methodProxy.invokeSuper(o,objects);//执行 唱歌
          System.err.println("4、唱完离开");
          return o1;
    }

}
