package study.learn.dubbo.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import study.learn.dubbo.api.DemoService;

/**
 * Hello world!
 *
 */
public class DemoConsumer {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"src/resources/dubbo-demo-consumer.xml");
		context.start();
		DemoService demoService = (DemoService) context.getBean("demoService");
		System.out.println(demoService.sayString("halo"));
	}
}
