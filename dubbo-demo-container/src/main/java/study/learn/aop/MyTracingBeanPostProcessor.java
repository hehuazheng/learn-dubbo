//package study.learn.aop;
//
//import java.lang.reflect.Field;
//import java.lang.reflect.Method;
//
//import net.sf.cglib.proxy.Enhancer;
//import net.sf.cglib.proxy.MethodInterceptor;
//import net.sf.cglib.proxy.MethodProxy;
//
//import org.springframework.aop.TargetSource;
//import org.springframework.aop.framework.ProxyFactory;
//import org.springframework.beans.BeansException;
//import org.springframework.beans.factory.config.BeanPostProcessor;
//import org.springframework.stereotype.Component;
//import org.springframework.util.ClassUtils;
//import org.springframework.util.ReflectionUtils;
//
//import com.alibaba.dubbo.config.spring.ServiceBean;
//
//@Component
//public class MyTracingBeanPostProcessor implements BeanPostProcessor {
//
//	/**
//	 * 手工加入注解强化
//	 */
//	public Object postProcessAfterInitialization(Object bean, String beanName)
//			throws BeansException {
////		if (ServiceBean.class.isInstance(bean)) {
////			try {
////				ServiceBean<?> sb = (ServiceBean<?>) bean;
////				Object obj = CglibProxyCreator.createProxy(sb.getRef());
////				Field f =ReflectionUtils.findField(ServiceBean.class, "ref");
////				f.setAccessible(true);
////				f.set(sb, obj);
////			} catch (Exception e) {
////				e.printStackTrace();
////			}
////		}
//		System.out.println("postProcessAfterInitialization invoked");
//		return bean;
//	}
//
//	public Object postProcessBeforeInitialization(Object bean, String beanName)
//			throws BeansException {
//		System.out.println("postProcessBeforeInitialization invoked");
//		System.out.println(beanName + " created at " + bean.toString());
//		return bean;
//	}
//
//	public static class CglibProxyCreator {
//		@SuppressWarnings("unchecked")
//		public static final <T> T createProxy(Object object) {
//			Enhancer enhancer = new Enhancer();
//			enhancer.setSuperclass(object.getClass());
//			enhancer.setCallback(new MethodInterceptor() {
//				@Override
//				public Object intercept(Object obj, Method m, Object[] args,
//						MethodProxy proxy) throws Throwable {
//					System.out.println("before invoke: " + m.getName());
//					Object result = proxy.invokeSuper(obj, args);
//					System.out.println("after invoke: " + m.getName());
//					return result;
//				}
//			});
//			return (T) enhancer.create();
//		}
//	}
//
//	protected Object createProxy(Class<?> beanClass, String beanName,
//			Object[] specificInterceptors, TargetSource targetSource) {
//
//		ClassLoader clazzLoader = Thread.currentThread()
//				.getContextClassLoader();
//		ProxyFactory proxyFactory = new ProxyFactory();
//		// Copy our properties (proxyTargetClass etc) inherited from
//		// ProxyConfig.
//		// Must allow for introductions; can't just set interfaces to
//		// the target's interfaces only.
//		Class<?>[] targetInterfaces = ClassUtils.getAllInterfacesForClass(
//				beanClass, clazzLoader);
//		for (Class<?> targetInterface : targetInterfaces) {
//			proxyFactory.addInterface(targetInterface);
//		}
//
//		proxyFactory.setTargetSource(targetSource);
//
//		return proxyFactory.getProxy(clazzLoader);
//	}
//
//	// protected Advisor[] buildAdvisors(String beanName, Object[]
//	// specificInterceptors) {
//	// List<Object> allInterceptors = new ArrayList<Object>();
//	// if (specificInterceptors != null) {
//	// allInterceptors.addAll(Arrays.asList(specificInterceptors));
//	// }
//	//
//	// Advisor[] advisors = new Advisor[allInterceptors.size()];
//	// for (int i = 0; i < allInterceptors.size(); i++) {
//	// advisors[i] = this.advisorAdapterRegistry.wrap(allInterceptors.get(i));
//	// }
//	// return advisors;
//	// }
//
//}
