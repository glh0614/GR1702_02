package com.goodstrade;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  ���� E-mail:757086146@qq.com
 * @date    ����ʱ�䣺2017��12��5�� ����5:35:18 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class TradeSer implements ITrade {

	public void help(){
		System.out.println("��1��������Ʒ");
		System.out.println("��2������");
		System.out.println("��3������");
		System.out.println("��4���鿴��Ʒ���");
		System.out.println("��5���˳�");
	}
	@Override
	public void getadd(ArrayList<Trade> arraylist, Scanner sc) {
		System.out.println("�������µ���Ʒ��ţ�");
		String a=sc.next();
		System.out.println("���������Ʒ�����ƣ�");
		String b=sc.next();
		System.out.println("���������Ʒ�ļ۸�");
		double c=sc.nextDouble();
		System.out.println("���������Ʒ��������");
		int d=sc.nextInt();
		Trade trade =new Trade(a,b,c,d);
		arraylist.add(trade);
		System.out.println("�ɹ����������Ʒ��");
		System.out.println(trade.toString());
	}

	@Override
	public void into(ArrayList<Trade> arraylist, Scanner sc) {
		System.out.println("����������������Ʒ��ţ�");
		String a=sc.next();
		boolean isnull=false;
		for (Trade trade : arraylist) {
			if(trade.getId().equals(a)){
				System.out.println("���������Ʒ����������");
				int b=sc.nextInt();
				trade.setNum(trade.getNum()+b);
				System.out.println("�����ɹ�������Ʒ������ӵ�"+trade.getNum());
				isnull=true;
				break;
			}
			else{
				isnull=false;
			}
		}
		if(!isnull){
			System.out.println("�Ҳ�������Ʒ������ʧ�ܣ�");
		}

	}

	@Override
	public void out(ArrayList<Trade> arraylist, Scanner sc) {
		System.out.println("�����������۵���Ʒ��ţ�");
		String a=sc.next();
		System.out.println("���������Ʒ������������");
		int b=sc.nextInt();
		boolean isnull=false;
		for (Trade trade : arraylist) {
			if(trade.getId().equals(a)){
				isnull=true;
				if(trade.getNum()>=b){
					trade.setNum(trade.getNum()-b);
					System.out.println("���۳ɹ�������Ʒ���ʣ��"+trade.getNum());
				}else{
					System.out.println("��治�㣬����ʧ�ܣ�");
				}
				break;
			}
			else{
				isnull=false;
			}
		}
		if(!isnull){
			System.out.println("�Ҳ�������Ʒ������ʧ�ܣ�");
		}
	}
	
	@Override
	public void info(ArrayList<Trade> arraylist) {
		boolean isnull=true;
		for (Trade trade : arraylist) {
			System.out.println(trade.toString());
			isnull=false;
		}
		if(isnull){
			System.out.println("�ֿ�տ���Ҳ��������ӣ�");
		}

	}

}
