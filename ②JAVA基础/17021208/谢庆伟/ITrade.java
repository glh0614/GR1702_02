package com.goodstrade;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  ���� E-mail:757086146@qq.com
 * @date    ����ʱ�䣺2017��12��5�� ����5:22:06 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public interface ITrade {

	void getadd(ArrayList<Trade> arraylist,Scanner sc);
	void into(ArrayList<Trade> arraylist,Scanner sc);
	void out(ArrayList<Trade> arraylist,Scanner sc);
	void info(ArrayList<Trade> arraylist);
}
