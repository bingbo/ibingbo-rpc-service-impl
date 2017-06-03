package com.ibingbo.rpc.service.impl;

import com.ibingbo.rpc.common.annotation.RpcService;
import com.ibingbo.rpc.service.IHelloService;

/**
 * Created by bing on 17/6/3.
 */
@RpcService(IHelloService.class)
public class HelloServiceImpl implements IHelloService{
    public String hello(String s) {
        return "hello, " + s;
    }
}
