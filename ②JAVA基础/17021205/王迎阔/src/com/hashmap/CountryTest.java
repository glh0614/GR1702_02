package com.hashmap;
/**
 * @author  ���� E-mail:1456014420@qq.com
 * @date    ����ʱ�䣺2017��11��27�� ����4:24:12 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class CountryTest {

	
	String name;
	long population;
	
	
	
	/**
	 * @param name
	 * @param population
	 */
	public CountryTest(String name, long population) {
		super();
		this.name = name;
		this.population = population;
	}



	@Override
	public String toString() {
		return "CountryTest [name=" + name + ", population=" + population + "]";
	}
	
	
}
