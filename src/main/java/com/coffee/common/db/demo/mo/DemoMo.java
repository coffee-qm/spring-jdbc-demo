package com.coffee.common.db.demo.mo;

import java.util.Map;

/**
 * @author QM
 */
public class DemoMo {
	private long id;
	private String name;

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append("{");
		sb.append("\"id\":\"").append(this.id).append("\"");
		sb.append(",\"name\":\"").append(this.name).append("\"");
		sb.append("}");
		return sb.toString();
	}

	public long getId() {
		return id;
	}

	public void setId(final long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public static DemoMo buildRecord(final Map<String, Object> record) {
		final DemoMo mo = new DemoMo();
		mo.setId(Long.valueOf(String.valueOf(record.get("id"))));
		mo.setName(String.valueOf(record.get("name")));
		return mo;
	}
}
