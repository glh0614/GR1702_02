package yangxueting;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  ���� qqE-mail:157334005@qq.com
 * @date    ����ʱ�䣺2017��12��7�� ����8:54:48 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class CommodityService implements InCommodity{

	@Override
	public void help() {
		System.out.println("1������Ʒ");
		System.out.println("2����");
		System.out.println("3����");
		System.out.println("4�ο����");
		System.out.println("5�˳�����");
	}

	@Override
	public void addCommodit(ArrayList<Commodit> arrayList, Scanner sc) {
		String s=sc.next();
		String[] a=s.split(",");
		if (a.length!=4) {
			System.out.println("���������Ϣ������Χ������������");
		} else {
			Commodit commodit=new Commodit(a[0],a[1],Double.parseDouble(a[2]),Double.parseDouble(a[3]));
			arrayList.add(commodit);
			System.out.println(commodit.toString());
		}
		
	}

	@Override
	public void infoCommodit(ArrayList<Commodit> arrayList) {
		for (Commodit commodit : arrayList) {
			System.out.println(commodit.toString());
		}
		
	}

	@Override
	public void stockCommodit(ArrayList<Commodit> arrayList, Scanner sc) {
		String id=sc.next();
		boolean isId=false;
		for (int i = 0; i<arrayList.size(); i++) {
			String string=arrayList.get(i).getId();
			if (id.equals(string)) {
				int d=sc.nextInt();
				arrayList.get(i).setQuantity(arrayList.get(i).getQuantity()+d);
				System.out.println("����������Ϊ:"+arrayList.get(i).getQuantity());
			}
			if (isId) {
				System.out.println("�Ҳ���������Ʒ������ʧ��");
			}
		}
	}

	@Override
	public void sellCommodit(ArrayList<Commodit> arrayList, Scanner sc) {
		String id=sc.next();
		boolean isNull=false;
		for (int i = 0; i < arrayList.size(); i++) {
			String string=arrayList.get(i).getId();
			if (id.equals(string)) {
				int num=sc.nextInt();
				double quantity= arrayList.get(i).getQuantity();
				if (quantity<num) {
					arrayList.get(i).setQuantity(quantity-num);
					System.out.println("���۵�����Ϊ:"+arrayList.get(i).getQuantity());
					isNull=true;
				} else {
					if (isNull) {
						System.out.println("����ʧ��");
					}
				}
			}
		}
		
	}

}
