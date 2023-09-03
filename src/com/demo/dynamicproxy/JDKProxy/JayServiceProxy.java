package com.demo.dynamicproxy.JDKProxy;

import java.awt.event.WindowFocusListener;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Objects;

public class JayServiceProxy implements InvocationHandler {
    private JayServiceImpl target;

    public JayServiceProxy(JayServiceImpl target)
    {
        this.target=target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException {
        System.err.println("1、周杰伦买来的机票");
        System.err.println("2、乘车到机场");
        Object money=method.invoke(target,args);
        System.err.println("4、唱完离开");
        return money;
    }
}
