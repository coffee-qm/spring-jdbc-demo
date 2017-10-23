package com.coffee.common.db.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author QM
 */
public class CommonDao {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	public void setDataSource(final DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(this.dataSource);
	}

	public <T extends Object> List<T> query(final String sql,
			final Object[] args, final Class<T> t) {
		return jdbcTemplate.queryForList(sql, t, args);
	}
}
