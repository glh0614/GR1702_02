package com;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
	ArrayList<Market> markets = new ArrayList<Market>();
		Marketsystem arr = new Marketsystem();
		Scanner sc = new Scanner(System.in);
		arr.help();	
		boolean condition = true;
	while (condition) {
		int key = sc.nextInt();
		switch (key) {
		case 1:
		System.out.println("������Ҫ���ӵ���Ʒ,��ʽ����:");
		System.out.println("001,������˹,0.5,60");
			arr.addArrayList(markets, sc);
			break;
		case 2:
			arr.setArrayList(markets, sc);
			break;
		case 3:
			arr.removeArrayList(markets, sc);
			break;
		case 4:
			arr.infoArrayList(markets);
			break;
		case 5:
			condition = false;
			break;
		default:
			break;
		}
	}
	System.out.println("ллʹ�ã��ټ�������");	
}
}