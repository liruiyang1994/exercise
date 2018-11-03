package com.jiusuzu.common.pojo;

import java.util.List;
/**
 * 通用esayUI数据表格结果集
 * @author 李锐洋
 */
public class EUDataGridResult {

	private long total;
	private List<?> rows;
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<?> getRows() {
		return rows;
	}
	public void setRows(List<?> rows) {
		this.rows = rows;
	}
	
	
}
