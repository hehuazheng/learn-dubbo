package study.learn.dubbo.provider;

import study.learn.dubbo.api.DemoService;

public class DemoServiceImpl implements DemoService {

	public String sayString(String str) {
		System.out.println("in demo service impl " + str);
		return "halo " + str;
	}
}
