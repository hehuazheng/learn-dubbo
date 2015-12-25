package study.learn.dubbo.api;

public interface DemoService {
	String sayString(String str);

	String testTransactionDirectly(int id);

	String testTransaction(int id);
}
