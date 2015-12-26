package study.learn.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class SimpleMethodInterceptor implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		try {
			System.out.println("before +++++++++++++++");
			Object result = arg0.proceed();
			System.out.println("after +++++++++++++++");
			return result;
		} catch (Exception e) {
			throw e;
		}
	}
}
