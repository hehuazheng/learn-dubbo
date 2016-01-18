package study.learn.dubbo.provider;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.rpc.RpcContext;

import study.learn.dubbo.api.DemoService;

@Service
public class DemoServiceImpl implements DemoService {

	public String sayString(String str) {
		System.out.println("in demo service impl "
				+ RpcContext.getContext().getAttachment("caller")
				+ RpcContext.getContext().getAttachment("appName"));
		return "halo " + str;
	}
}
