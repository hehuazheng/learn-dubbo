package study.learn.dubbo.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import study.learn.annotation.TestAnnotation;
import study.learn.dubbo.api.DemoService;
import study.learn.service.TransactionService;

@Service
public class DemoServiceImpl implements DemoService {
	@Autowired
	private TransactionService transactionService;

	@TestAnnotation("DemoServiceImpl")
	public String sayString(String str) {
		System.out.println("in demo service impl " + str);
		return str;
	}

	public String testTransaction(int id) {
		System.out.println("start transaction test");
		transactionService.addInto2Tables(id);
		System.out.println("end transaction test");
		return "succ";
	}
}
