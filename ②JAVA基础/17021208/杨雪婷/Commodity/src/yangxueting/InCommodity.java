package yangxueting;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  ���� qqE-mail:157334005@qq.com
 * @date    ����ʱ�䣺2017��12��7�� ����8:17:25 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public interface InCommodity {

	void help();
	void addCommodit(ArrayList<Commodit>arrayList,Scanner sc);
	void infoCommodit(ArrayList<Commodit>arrayList);
	void stockCommodit(ArrayList<Commodit>arrayList,Scanner sc);
	void sellCommodit(ArrayList<Commodit>arrayList,Scanner sc);
}
