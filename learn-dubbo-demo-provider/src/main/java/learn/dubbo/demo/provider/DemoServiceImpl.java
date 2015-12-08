package learn.dubbo.demo.provider;

import learn.dubbo.demo.api.DemoService;

public class DemoServiceImpl implements DemoService {

	public String sayString(String str) {
		System.out.println("in demo service impl " + str);
		return "halo " + str;
	}

}
