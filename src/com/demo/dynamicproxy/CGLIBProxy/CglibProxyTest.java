package com.demo.dynamicproxy.CGLIBProxy;

import com.demo.dynamicproxy.JDKProxy.JayService;
import com.demo.dynamicproxy.JDKProxy.JayServiceImpl;

public class CglibProxyTest {
    //CGLIB动态代理：通过修改底层的字节码技术，来实现改变.class类来实现修改类达到代理的目的。什么是字节码技术？.java文件
    //通过编译器编译之后，就生成.class文件，.class文件中的数据就称之为字节码，实际上就是一腿二进制数据，这些二进制数据，只
    //有JVM才能读懂，.class文件里边的二进制数据就是字节码，它的jvm解析程序运行代码的指令，如果我们去修改了字节码，就相当于
    //是修改了类本身，从而就对类进行了修改，这样性能就会比较搞，而且不需要目标对象实现接口，任何一个.java文件都可以被动态代理。
    //操作字节码修改其实就是对字节码进行增删改查，常用比较出名的框架有ASM框架。
    //.class文件是通过一个ClassLoader(类加载器)加载到JVM中的。
    public static void main(String[] args) {
        JayServiceCglibProxy cglibProxy=new JayServiceCglibProxy();
        JayService jayService=(JayServiceImpl)cglibProxy.getProxyClass(JayServiceImpl.class);
        jayService.sing();
    }
}
