package study.learn.dubbo.api;

public interface DemoService {
	String sayString(String str);

	String testTransaction(int id);

	String testTransactionDirectly(int id);
}
