package com.coffee.common.db.demo.dao;

import java.util.List;

import com.coffee.common.db.dao.CommonDao;
import com.coffee.common.db.demo.mo.DemoMo;

/**
 * @author QM
 */
public class DemoDao {
	private CommonDao dao;

	public void setDao(final CommonDao dao) {
		this.dao = dao;
	}

	public List<DemoMo> query() {
		final String sql = "select id, name from demo";
		return dao.query(sql, new Object[0], DemoMo.class);
	}
}
