package com.demo.dynamicproxy.JDKProxy;

import java.math.BigDecimal;

public class JayServiceImpl implements JayService{
    @Override
    public BigDecimal sing()
    {
        System.err.println("唱了一首七里香");
        return new BigDecimal("1000000000");
    }
}
