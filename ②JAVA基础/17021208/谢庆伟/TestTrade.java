package com.goodstrade;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  ���� E-mail:757086146@qq.com
 * @date    ����ʱ�䣺2017��12��5�� ����6:23:14 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class TestTrade {

	public static void main(String[] args) {
		ArrayList<Trade> trade=new ArrayList<Trade>();
		TradeSer ser=new TradeSer();
		Scanner sc=new Scanner(System.in);
		boolean is=true;
		String key;
		System.out.println("---------��Ʒ����---------");
		ser.help();
		while (is) {
			System.out.println("������ָ������롾0���鿴������");
			key=sc.next();
			switch (key) {
			case "0":
				ser.help();
				break;
			case "1":
				ser.getadd(trade, sc);
				break;
			case "2":
				ser.into(trade, sc);
				break;
			case "3":
				ser.out(trade, sc);
				break;
			case "4":
				ser.info(trade);
				break;
			case "5":
				is=false;
				System.out.println("��л����ʹ�ã��ټ���");
				break;
			default:
				System.out.println("ָ����Ч������������");
				break;
			}
		}

	}

}
