package com.erp.viewModel;

import java.util.ArrayList;
import java.util.List;
/**
 * 类功能说明 TODO:Exception工具类
 * 类修改者	修改日期
 * 修改说明
 * <p>Title: BaseService.java</p>
 * <p>Description:mxf</p>
 * <p>Copyright: Copyright (c) 2006</p>
 * <p>Company:mxf</p>
 * @author dzxy 912031125@qq.com
 * @date 2017-4-19 下午03:18:05
 * @version V1.0
 */
@SuppressWarnings("rawtypes")
public class GridModel {
	private List  rows= new ArrayList();
	private Long total=0L;
	public List getRows() {
		return rows;
	}
	public void setRows(List rows) {
		this.rows = rows;
	}
	public Long getTotal() {
		return total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}
}
