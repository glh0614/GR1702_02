package com.hashmap;

import java.util.HashMap;

/** 
 * @author  ���� E-mail:757086146@qq.com
 * @date    ����ʱ�䣺2017��12��5�� ����8:30:31 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class TestHashMap {

	public static void main(String[] args) {
		HashMap<Country, String> hashmap=new HashMap<Country, String>();
		Country china=new Country("china",16);
		Country US=new Country("US",16);
		Country japan=new Country("japan",2);
		hashmap.put(china, "beijing");
		hashmap.put(US, "niuye");
		hashmap.put(japan, "dongjing");
		hashmap.get(japan);
	}

}
