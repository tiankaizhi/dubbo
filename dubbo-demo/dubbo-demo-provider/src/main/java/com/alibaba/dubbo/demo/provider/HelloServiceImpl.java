package com.alibaba.dubbo.demo.provider;

import com.alibaba.dubbo.demo.HelloService;
import com.alibaba.dubbo.rpc.RpcContext;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author tiankaizhi@unicloud.com
 * @version 1.0
 * @date 2019/12/25
 **/
public class HelloServiceImpl implements HelloService {

    @Override
    public String say(String speak) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] " +
                speak + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());

        return speak + ", response from provider: " + RpcContext.getContext().getLocalAddress();
    }
}
