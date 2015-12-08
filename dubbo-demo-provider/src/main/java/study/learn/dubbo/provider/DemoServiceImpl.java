package study.learn.dubbo.provider;

import org.springframework.stereotype.Service;

import study.learn.dubbo.api.DemoService;

@Service
public class DemoServiceImpl implements DemoService {

	public String sayString(String str) {
		System.out.println("in demo service impl " + str);
		return "halo " + str;
	}
}
