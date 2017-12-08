package com.xx;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayCommodity implements IArray{
	
	void help(){
		System.out.println("----------------------");
		System.out.println("    ��1������Ʒ                ");
		System.out.println("    ��2�鿴���                ");
		System.out.println("    ��3����                       ");
		System.out.println("    ��4����                       ");
		System.out.println("    ��5�˳���ϵͳ            ");
		System.out.println("----------------------");
	}

	
	public void addCommodity(ArrayList<Commodity> arrs, Scanner as) {
		String a = as.next();
		String[] s = a.split(",");
		if (s.length!=4) {
			System.out.println("�������");
		} else {
			Commodity commodity = new  Commodity(s[0], s[1], Double.parseDouble(s[2]),Integer.parseInt(s[3]));
			arrs.add(commodity);
			System.out.println(commodity.toString());
		}
		}

	@Override
	public void infoCommodity(ArrayList<Commodity> arrs) {
		for (int i = 0; i < arrs.size(); i++) {
			System.out.println(arrs.get(i).toString());
		}
		
	}
	
	
	//����
	@Override
	public void stock(ArrayList<Commodity> arrs, Scanner as) {
		System.out.println("��������Ҫ��������Ʒ���");
		String s = as.next();
		boolean isid  = false;
		for (int i = 0; i < arrs.size(); i++) {
			String e = arrs.get(i).getNumber();
			if (s.equals(e)) {
				System.out.println("��������Ҫ����������");
				int k = as.nextInt();
				arrs.get(i).setQuantity(arrs.get(i).getQuantity()+k);
				System.out.println(arrs.get(i).toString());
				isid = true;
			}
			}
		if (!isid) {
			System.out.println("����ʧ��");
		}
		
	}
	//����
	@Override
	public void sell(ArrayList<Commodity> arrs,Scanner as) {
		System.out.println("��������Ҫ��������Ʒ���");
		String w = as.next();
		boolean isid = false;
		for (int i = 0; i < arrs.size(); i++) {
			String e = arrs.get(i).getNumber();
			if (w.equals(e)) {
				System.out.println("�����������۵���Ʒ����");
				int l = as.nextInt();
				int z = arrs.get(i).getQuantity();
				if(z>=l){
					arrs.get(i).setQuantity(arrs.get(i).getQuantity()-l);
					System.out.println(arrs.get(i).toString());
					isid = true;
				}
				}
				}
		if (!isid) {
			System.out.println("����ʧ��");
		}
			}
			
		
	
	
}
