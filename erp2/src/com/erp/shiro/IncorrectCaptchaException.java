package com.erp.shiro;

import org.apache.shiro.authc.AuthenticationException;

/**
* 类功能说明 TODO:自定义验证码错误异常
* 类修改者
* 修改日期
* 修改说明
* <p>Title: IncorrectCaptchaException.java</p>
* <p>Description:mxf</p>
* <p>Copyright: Copyright (c) 2012</p>
* <p>Company:mxf</p>
* @author dzxy 912031125@qq.com
* @date 2017-5-29 上午11:31:58
* @version V1.0
*/

public class IncorrectCaptchaException extends AuthenticationException
{
	private static final long serialVersionUID = -1313703243328340861L;

	public IncorrectCaptchaException()
	{
		super();
	}

	public IncorrectCaptchaException(String message, Throwable cause)
	{
		super(message, cause);
	}

	public IncorrectCaptchaException(String message)
	{
		super(message);
	}

	public IncorrectCaptchaException(Throwable cause)
	{
		super(cause);
	}
}
