/** 
 * @author  ���� E-mail:
 * @date    ����ʱ�䣺2017��12��5�� ����8:34:16 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapTest {

	public static void main(String[] args) {

		HashMap<Country, String> hashMap = new HashMap<Country, String>();

		Country china = new Country("china", 15);

		Country india = new Country("india", 14);

		Country japan = new Country("japan", 13);

		hashMap.put(china, "BeiJng");

		hashMap.put(india, "Delhi");

		hashMap.put(japan, "Tokyo");

		Iterator<Entry<Country, String>> iterator = hashMap.entrySet()
				.iterator();

		while (iterator.hasNext()) {

			Entry<Country, String> entry = iterator.next();
			String value = entry.getValue();
			Country key = entry.getKey();
			System.out.println(key.toString() + " " + value);
		}
	}
}
