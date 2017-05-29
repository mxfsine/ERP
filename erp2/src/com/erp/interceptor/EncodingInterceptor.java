package com.erp.interceptor;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
* 类功能说明 TODO:
* 类修改者	修改日期
* 修改说明
* <p>Title: EncodingInterceptor.java</p>
* <p>Description:mxf</p>
* <p>Copyright: Copyright (c) 2012</p>
* <p>Company:mxf</p>
* @author dzxy 912031125@qq.com
* @date 2017-4-19 上午09:05:30
* @version V1.0
*/
public class EncodingInterceptor extends AbstractInterceptor {
	private static final long	serialVersionUID	= -1491545455517544577L;

	public String intercept(ActionInvocation actionInvocation) throws Exception {
		ServletActionContext.getResponse().setCharacterEncoding("utf-8");
		ServletActionContext.getRequest().setCharacterEncoding("utf-8");
		return actionInvocation.invoke();
	}

}
