package com.hzz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.dubbo.rpc.RpcContext;

import study.learn.dubbo.api.DemoService;
import study.learn.dubbo.api.DemoService2;

@Service
public class TestService {
	@Autowired
	private DemoService demoService;
	@Autowired
	private DemoService2 demoService2;

	public void testStr(String str) {
		System.out.println(demoService.sayString(str));
		System.out.println("demoService caller: "
				+ RpcContext.getContext().getAttachment("caller"));
		System.out.println(demoService2.echoString(str));
		System.out.println("demoService2 caller: "
				+ RpcContext.getContext().getAttachment("caller"));
	}
}
