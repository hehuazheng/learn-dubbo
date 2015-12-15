package study.learn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import study.learn.dubbo.api.DemoService;

@Controller
@RequestMapping("/test")
public class TestController {
	@Autowired
	private DemoService demoService;
	
	@ResponseBody
	@RequestMapping("/hw")
	public String helloWorld(String name) {
		return "hello " + name;
	}
	
	@ResponseBody
	@RequestMapping("/testAnnotationOnDubboService")
	public String testAopAnno(String str) {
		return demoService.sayString(str);
	}
}
