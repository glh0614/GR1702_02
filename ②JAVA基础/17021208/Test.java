package com.stock;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Stock> arrayList = new ArrayList<Stock>();
		StockServer server = new StockServer();
		server.help();
		boolean isQuite = true;
		int key;
		while (isQuite) {
			System.out.println("��������Ҫִ�е�ָ��");
			key = sc.nextInt();
			switch (key) {
			case 1:
				System.out.println("��������ӵ���Ʒ");
				server.addStock(arrayList, sc);
				break;
			case 2 :
				break;
			case 3:
				break;
			case 4:
				server.infoStock(arrayList);
				break;
			case 5:
				isQuite = false;
				break;
			default:
				System.out.println("����ָ������");
				break;
			}
		}
		System.out.println("�ټ�!");
	}

}
