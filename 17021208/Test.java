package com.test;

import java.util.ArrayList;
import java.util.Scanner;


public class Test {
public static void main(String[] args) {
	ArrayList<Commodity> arrayList = new ArrayList<Commodity>();
	CommodityService commodityService=new CommodityService();
	Scanner sc =new Scanner(System.in);
	commodityService.helpinfo();
	int key;
	boolean isquit=true;
	while (isquit) {
		 key = sc.nextInt();
		 switch (key) {
		case 1:
			System.out.println("����������Ʒ���س� ");
			commodityService.addCommodity(arrayList, sc);
			break;
		case 4:
			System.out.println("����");
			commodityService.infoCommodity(arrayList);
			break;
		default:
			break;
		}
		
	}
}}