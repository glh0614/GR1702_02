package Com.singleInstance;
/** 
 * @author  ���� qqE-mail:157334005@qq.com
 * @date    ����ʱ�䣺2017��12��5�� ����11:34:05 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class SingleInstance {

	private SingleInstance(){
	}
	private final static SingleInstance INSTANCE=new SingleInstance();
	
	public static final SingleInstance getInstance(){
		return SingleInstance.INSTANCE;
	}
}
