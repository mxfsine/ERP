package com.erp.util;

import java.util.ResourceBundle;
/**
 * 类功能说明 TODO: 项目参数工具类
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
public class ResourceUtil {

	private static final ResourceBundle bundle = java.util.ResourceBundle.getBundle("config");

	/**
	 * 获得sessionInfo名字
	 * 
	 * @return
	 */
	public static final String getSessionInfoName() {
		return bundle.getString("sessionInfoName");
	}

	/**
	 * 获得上传表单域的名称
	 * 
	 * @return
	 */
	public static final String getUploadFieldName() {
		return bundle.getString("uploadFieldName");
	}

	/**
	 * 获得上传文件的最大大小限制
	 * 
	 * @return
	 */
	public static final long getUploadFileMaxSize() {
		return Long.valueOf(bundle.getString("uploadFileMaxSize"));
	}

	/**
	 * 获得允许上传文件的扩展名
	 * 
	 * @return
	 */
	public static final String getUploadFileExts() {
		return bundle.getString("uploadFileExts");
	}

	/**
	 * 获得上传文件要放到那个目录
	 * 
	 * @return
	 */
	public static final String getUploadDirectory() {
		return bundle.getString("uploadDirectory");
	}

}
