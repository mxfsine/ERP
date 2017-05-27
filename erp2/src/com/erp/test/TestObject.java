package com.erp.test;

import java.util.ArrayList;
import java.util.List;

public class TestObject {

	/**
	 * @Title: main 
	 * @Description: TODO
	 * @param args    参数 
	 * @return void    返回类型 
	 * @throws 
	 */
	
	private static Object []obj = new Object[]{"1","wang","li"};
	private static Object []obj2 = new Object[]{"2","tang","mi"};
	private static Object objs = obj;
	private static List<Object []> list =new ArrayList<Object []>();
	static{
		list.add(obj);
		list.add(obj2);
	}
	public static void main(String[] args) {
		for(Object o :list){
			Object []obj3 =(Object[]) o;
			System.out.println(obj3[1]);
		}
	}

}
