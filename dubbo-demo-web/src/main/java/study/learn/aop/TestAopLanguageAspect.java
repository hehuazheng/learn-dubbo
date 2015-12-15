package study.learn.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import study.learn.annotation.TestAnnotation;

@Component
@Aspect
public class TestAopLanguageAspect {

	/**
	 * 根据包名拦截
	 * 
	 * @param joinPoint
	 * @return
	 * @throws Throwable
	 */
	@Around("within(study.learn.dubbo..*) and @annotation(anno)")
	public Object usePackage(ProceedingJoinPoint joinPoint, TestAnnotation anno)
			throws Throwable {
		System.out.println("use package aspect start - " + anno.value());
		Object obj = joinPoint.proceed();
		System.out.println("use package aspect end");
		return obj;
	}
}
