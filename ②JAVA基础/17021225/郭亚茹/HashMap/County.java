package com.HashMap;
/** 
 * @author  ���� E-mail:1561061182@qq.com
 * @date    ����ʱ�䣺2017��11��8�� ����6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class County {
	String name;
	long population;

	
	public County(String name, long population) {
		super();
		this.name = name;
		this.population = population;
		
	}


	@Override
	public String toString() {
		return "County [name=" + name + ", population=" + population + "]";
	}
	

}
