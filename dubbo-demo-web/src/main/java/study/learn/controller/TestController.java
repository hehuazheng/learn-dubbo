package study.learn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hzz.service.TestService;

@Controller
@RequestMapping("/test")
public class TestController {
	@Autowired
	private TestService testService;

	@ResponseBody
	@RequestMapping("/hw")
	public String helloWorld(String name) {
		return "hello " + name;
	}

	@ResponseBody
	@RequestMapping("/t")
	public String testService(String val) {
		testService.testStr(val);
		return "succ";
	}
}
