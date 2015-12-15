package study.learn.dubbo.provider;

import org.springframework.stereotype.Service;

import study.learn.annotation.TestAnnotation;
import study.learn.dubbo.api.DemoService;

@Service
public class DemoServiceImpl implements DemoService {
//	@Autowired
//	private DemoServiceHelper demoServiceHelper;
	
	@TestAnnotation("DemoServiceImpl")
	public String sayString(String str) {
		System.out.println("in demo service impl " + str);
//		return demoServiceHelper.sayString(str);
		return str;
	}
}
