package study.learn.dubbo.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import study.learn.dubbo.api.DemoService;
import study.learn.dubbo.provider.helper.component.DemoServiceHelper;

@Service
public class DemoServiceImpl implements DemoService {
	@Autowired
	private DemoServiceHelper demoServiceHelper;
	
	public String sayString(String str) {
		System.out.println("in demo service impl " + str);
		return demoServiceHelper.sayString(str);
	}
}
