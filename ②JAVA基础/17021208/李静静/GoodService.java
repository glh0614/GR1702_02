package lijingjing;

import java.util.ArrayList;
import java.util.Scanner;

public class GoodService implements IGoods {
	void help(){
		System.out.println("----��Ʒ----");
		System.out.println("1��������Ʒ������1");
		System.out.println("2������������2");
		System.out.println("3������������3");
		System.out.println("4���ο����������4");
		System.out.println("5���˳�������5");
	}

	@Override
	public void addGoods(ArrayList<Goods> arrayList, Scanner sc) {
		String a = sc.next();
		//���
		String[] split = a.split(",");
		
		Goods goods = new Goods();
		
		goods.setName(split[0]);
		goods.setNumber(split[1]);
		goods.setPrice(Double.parseDouble(split[2]));
		goods.setAmount((int) Double.parseDouble(split[3]));
		
		arrayList.add(goods);
		
		System.out.println(goods.toString());
	}

	@Override
	public void remoreGoods(ArrayList<Goods> arrayList, String e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setGoods(ArrayList<Goods> arrayList, Scanner sc) {
		// TODO Auto-generated method stub

	}

	@Override
	public void findGoods(ArrayList<Goods> arrayList, String name) {
		// TODO Auto-generated method stub

	}

}
