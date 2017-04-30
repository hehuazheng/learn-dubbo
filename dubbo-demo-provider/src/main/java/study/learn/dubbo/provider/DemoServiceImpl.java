package study.learn.dubbo.provider;

import org.springframework.stereotype.Service;

import study.learn.dubbo.api.DemoService;

@Service
public class DemoServiceImpl implements DemoService {
	@Override
	public String test(int p) {
		System.out.println("int invoked: " + p);
		return "int";
	}

	@Override
	public void test(long p) {
		System.out.println("long invoked: " + p);
	}
	
	public static void main(String[] args) {
		System.out.println(new DemoServiceImpl().test(11));
	}
}
