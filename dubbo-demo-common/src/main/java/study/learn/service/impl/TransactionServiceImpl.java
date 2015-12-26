package study.learn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import study.learn.dao.mapper.Tb1Mapper;
import study.learn.dao.mapper.Tb2Mapper;
import study.learn.dao.model.Tb1;
import study.learn.dao.model.Tb2;
import study.learn.service.TransactionService;

@Service
public class TransactionServiceImpl implements TransactionService {
	@Autowired
	private Tb1Mapper tb1Mapper;

	@Autowired
	private Tb2Mapper tb2Mapper;

	@Transactional(readOnly = false, isolation = Isolation.READ_COMMITTED, rollbackFor = Exception.class)
	public void addInto2Tables(int id) {
		Tb1 r = new Tb1();
		r.setId(id);
		r.setCol1("id " + id);
		tb1Mapper.insert(r);

		Tb2 tb2 = new Tb2();
		tb2.setId(id);
		tb2.setCol1("id " + id);
		tb2Mapper.insert(tb2);
	}

	@Transactional(readOnly = false, isolation = Isolation.READ_COMMITTED, rollbackFor = Exception.class)
	public void addIntoTb1(int id) {
		Tb1 r = new Tb1();
		r.setId(id);
		r.setCol1("id " + id);
		tb1Mapper.insert(r);
	}
}
