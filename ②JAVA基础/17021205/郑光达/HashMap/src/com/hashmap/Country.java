/** 
 * @author  ���� E-mail:
 * @date    ����ʱ�䣺2017��12��5�� ����9:01:41 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.hashmap;

public class Country {

	String name;

	long population;

	public Country(String name, long population) {

		this.name = name;
		this.population = population;

	}

	@Override
	public String toString() {
		return "Country [name=" + name + ", population=" + population + "]";
	}

}
