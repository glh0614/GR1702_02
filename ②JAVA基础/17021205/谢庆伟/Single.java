package com.hashmap;
/** 
 * @author  ���� E-mail:757086146@qq.com
 * @date    ����ʱ�䣺2017��12��5�� ����11:30:09 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Single {
	//����ģʽ
	
	public Single(){
		
	}
	private static Single single=new Single();
	public static Single getsingle(){
		return single;
	}
}
