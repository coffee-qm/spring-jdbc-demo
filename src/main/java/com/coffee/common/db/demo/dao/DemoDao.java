package com.coffee.common.db.demo.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.coffee.common.db.dao.CommonDao;
import com.coffee.common.db.demo.mo.DemoMo;

/**
 * @author QM
 */
@Service("demoDao")
@Scope("prototype")
public class DemoDao {
	@Resource(name = "commonDao")
	private CommonDao dao;

	public List<DemoMo> query() {
		final String sql = "select id, name from demo.demo";
		final List<Map<String, Object>> data = dao.query(sql, new Object[0]);
		final List<DemoMo> res = new ArrayList<DemoMo>();
		for (final Map<String, Object> record : data) {
			res.add(DemoMo.buildRecord(record));
		}
		return res;
	}
}
