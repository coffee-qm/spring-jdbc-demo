package com.coffee.common.db.demo.service.impl;

import java.util.List;

import com.coffee.common.common.exp.SvcException;
import com.coffee.common.db.demo.dao.DemoDao;
import com.coffee.common.db.demo.mo.DemoMo;
import com.coffee.common.db.demo.service.DemoSvc;

/**
 * @author QM
 */
public class DemoSvcImpl implements DemoSvc {
	private DemoDao dao;

	public void setDao(final DemoDao dao) {
		this.dao = dao;
	}

	@Override
	public List<DemoMo> query() throws SvcException {
		return dao.query();
	}
}
