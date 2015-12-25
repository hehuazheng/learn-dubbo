package study.learn.dubbo.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import study.learn.annotation.TestAnnotation;
import study.learn.dao.mapper.Tb1Mapper;
import study.learn.dao.mapper.Tb2Mapper;
import study.learn.dao.model.Tb1;
import study.learn.dao.model.Tb2;
import study.learn.dubbo.api.DemoService;
import study.learn.service.TransactionService;

@Service
public class DemoServiceImpl implements DemoService {
	@Autowired
	private TransactionService transactionService;

	@Autowired
	private Tb1Mapper tb1Mapper;

	@Autowired
	private Tb2Mapper tb2Mapper;

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

	@Override
	@TestAnnotation
	public String testTransactionDirectly(int id) {
		Tb1 r = new Tb1();
		r.setId(id);
		r.setCol1("id " + id);
		tb1Mapper.insert(r);

		Tb2 tb2 = new Tb2();
		tb2.setId(id);
		tb2.setCol1("id " + id);
		tb2Mapper.insert(tb2);
		
		return "succ";
	}
}
