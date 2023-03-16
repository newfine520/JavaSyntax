package com.demo;
//java抽象类的子类必须实现父类的抽象方法，如果没有实现，该子类必须用abstract修饰
public abstract class ApplicationContext extends FactoryBean {
    public abstract void copy();
}
