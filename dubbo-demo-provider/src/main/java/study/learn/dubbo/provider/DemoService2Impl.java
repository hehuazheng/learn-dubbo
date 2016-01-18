package study.learn.dubbo.provider;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.rpc.RpcContext;

import study.learn.dubbo.api.DemoService2;

@Service
public class DemoService2Impl implements DemoService2 {
	@Override
	public String echoString(String str) {
		System.out.println("in demoservice2: " + RpcContext.getContext().getAttachment("caller") + RpcContext.getContext().getAttachment("appName"));
		return str;
	}
}
