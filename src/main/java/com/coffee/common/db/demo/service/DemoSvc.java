package com.coffee.common.db.demo.service;

import java.util.List;

import com.coffee.common.common.exp.SvcException;
import com.coffee.common.db.demo.mo.DemoMo;

/**
 * @author QM
 */
public interface DemoSvc {
	public List<DemoMo> query() throws SvcException;
}
