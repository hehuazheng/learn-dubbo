package learn.dubbo.demo.provider;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProviderMain {

	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"dubbo-demo-provider.xml");
		System.out.println("start provider...");
		context.start();
		System.in.read();
		context.close();
	}

}
