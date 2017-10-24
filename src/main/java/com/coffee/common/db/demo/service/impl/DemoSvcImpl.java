package com.coffee.common.db.demo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.coffee.common.common.exp.SvcException;
import com.coffee.common.db.demo.dao.DemoDao;
import com.coffee.common.db.demo.mo.DemoMo;
import com.coffee.common.db.demo.service.DemoSvc;

/**
 * @author QM
 */
@Service("demoSvc")
@Scope("prototype")
public class DemoSvcImpl implements DemoSvc {
	@Resource(name = "demoDao")
	private DemoDao dao;

	@Override
	public List<DemoMo> query() throws SvcException {
		final List<DemoMo> lst = dao.query();
		System.out.println(lst);
		return lst;
	}
}
