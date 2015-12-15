package study.learn.dubbo.provider.helper.component.impl;

import org.springframework.stereotype.Component;

import study.learn.annotation.TestAnnotation;
import study.learn.dubbo.provider.helper.component.DemoServiceHelper;

@Component
public class DemoServiceHelperImpl implements DemoServiceHelper {

	@TestAnnotation("DemoServiceHelperImpl")
	public String sayString(String str) {
		System.out.println("in DemoServiceHelperImpl " + str);
		return "halo " + str;
	}

}
