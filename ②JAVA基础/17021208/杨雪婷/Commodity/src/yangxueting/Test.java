package yangxueting;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  ���� qqE-mail:157334005@qq.com
 * @date    ����ʱ�䣺2017��12��7�� ����9:16:04 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test {

	public static void main(String[] args) {
		ArrayList<Commodit> arrayList=new ArrayList<Commodit>();
		CommodityService commodit=new CommodityService();
		Scanner sc=new Scanner(System.in);
		commodit.help();
		int key=0;
		
		boolean isQuit=true;
		while (isQuit) {
			key=sc.nextInt();
			switch (key) {
			case 1:
				commodit.addCommodit(arrayList, sc);
				break;
			case 2:
				commodit.stockCommodit(arrayList, sc);
				break;
			case 3:
				commodit.sellCommodit(arrayList, sc);
				break;
			case 4:
				commodit.infoCommodit(arrayList);
				break;
			case 5:
				isQuit = false;
				break;
			
			default:
				break;
			}
		}
		System.out.println("���˳�����");
	}
}
