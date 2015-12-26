package study.learn.aop;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.spring.ServiceBean;

@Component
public class MyTracingBeanPostProcessor implements BeanPostProcessor {

	/**
	 * 手工加入注解强化
	 */
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		if (ServiceBean.class.isInstance(bean)) {
			System.out.println("service bean");
		}
		System.out.println("postProcessAfterInitialization invoked");
		return bean;
	}

	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("postProcessBeforeInitialization invoked");
		System.out.println(beanName + " created at " + bean.toString());
		return bean;
	}
}