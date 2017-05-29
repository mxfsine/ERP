package com.erp.util;

import javax.servlet.http.HttpServletRequest;
/**
 * 类功能说明 TODO:request工具类
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
public class RequestUtil {

	/**
	 * 获得请求路径
	 * 
	 * @param request
	 * @return
	 */
	public static String getRequestPath(HttpServletRequest request) {
		String requestPath = request.getRequestURI();
		requestPath = requestPath.substring(request.getContextPath().length());// 去掉项目路径
		return requestPath;
	}

}
