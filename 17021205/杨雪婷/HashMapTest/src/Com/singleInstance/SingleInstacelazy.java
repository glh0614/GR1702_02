package Com.singleInstance;
/** 
 * @author  ���� qqE-mail:157334005@qq.com
 * @date    ����ʱ�䣺2017��12��5�� ����11:45:07 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class SingleInstacelazy {

	private SingleInstacelazy(){
	}
	private static SingleInstacelazy singleInstacelazy=null;
	public static SingleInstacelazy getsingleInstacelazy(){
		if (singleInstacelazy!=null) {
			singleInstacelazy=new SingleInstacelazy();
		}
		return singleInstacelazy;
		
	}
}
