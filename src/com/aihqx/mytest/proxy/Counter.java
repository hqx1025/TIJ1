package com.aihqx.mytest.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author huqingxiang
 * @date 28/03/2018 3:22 PM
 */
public class Counter implements InvocationHandler {

    private Object brand;

    public Counter(Object brand){
        this.brand = brand;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("销售开始 柜台是:"+this.getClass().getSimpleName());
        method.invoke(brand,args);
        System.out.println("销售结束");
        return null;
    }
}
