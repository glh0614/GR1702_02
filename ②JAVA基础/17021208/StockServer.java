package com.stock;

import java.util.ArrayList;
import java.util.Scanner;

public class StockServer implements IStock {
	
	void help(){
		System.out.println("��Ʒ����ϵͳ");
		System.out.println("1   ������Ʒ");
		System.out.println("2   ����");
		System.out.println("3   ����");
		System.out.println("4   �ο����");
		System.out.println("5   �˳�����");
	}

	@Override
	public void addStock(ArrayList<Stock> arrayList, Scanner sc) {
		String s = sc.next();
		String[] arr = s.split(",");
		Stock stock = new Stock(arr[0], arr[1], Double.parseDouble(arr[2]), Integer.parseInt(arr[3]));
		arrayList.add(stock);
		infoStock(arrayList);
	}
	
	public void add(ArrayList<Stock> arrayList, Scanner sc){
		String y = sc.next();
		for (int i = 0; i < arrayList.size(); i++) {
			String id = arrayList.get(i).getId();
			if (y.equals(id)) {
				int a;
				arrayList.get(i).getQuantity();
				
			}
		}
	}
	public void remove(){
		
	}
	public void infoStock(ArrayList<Stock> arrayList){
		for (Stock stock1 : arrayList) {
			System.out.println(stock1.toString());
		}
	}	
}
