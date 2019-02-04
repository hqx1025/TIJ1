package com.aihqx.mytest.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author huqingxiang
 * @date 28/03/2018 3:28 PM
 */
public class TestProxy {
    public static void main(String[] args) {
        MaoTai mt = new MaoTai();
        WuLiangYe wly = new WuLiangYe();
        ZhenLong zl = new ZhenLong();
        InvocationHandler ih = new Counter(mt);
        InvocationHandler ih2 = new Counter(wly);
        InvocationHandler ih3 = new Counter(zl);
        SellWine dynamicProxy = (SellWine) Proxy.newProxyInstance(MaoTai.class.getClassLoader(),MaoTai.class.getInterfaces(),ih);
        SellWine dynamicProxy2 = (SellWine) Proxy.newProxyInstance(WuLiangYe.class.getClassLoader(),WuLiangYe.class.getInterfaces(),ih2);
        SellCigarette dynamicProxy3 = (SellCigarette) Proxy.newProxyInstance(ZhenLong.class.getClassLoader(),ZhenLong.class.getInterfaces(),ih3);
        dynamicProxy.sell();
        dynamicProxy2.sell();
        dynamicProxy3.sell();
    }
}
