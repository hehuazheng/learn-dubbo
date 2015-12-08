package learn.dubbo.demo.consumer;

import java.io.IOException;

import learn.dubbo.demo.api.DemoService;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerMain {
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-demo-consumer.xml");
		context.start();
		System.out.println("consumer start...");
		DemoService service = (DemoService)context.getBean("demoService");
		System.out.println(service.sayString("aa"));
		System.in.read();
		context.close();
	}
}
