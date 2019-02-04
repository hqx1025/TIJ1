package com.aihqx.thinkinginjava.chapter10.package3;

import com.aihqx.thinkinginjava.chapter10.package1.Inter;
import com.aihqx.thinkinginjava.chapter10.package2.Interimpl;

/**
 * @author huqingxiang
 * @date 2018/2/15 下午2:55
 */
public class AA extends Interimpl {
    public Inter f1(){
        return new Inner();
    }
}
