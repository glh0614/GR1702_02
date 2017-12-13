package com.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

/**
 * @author ���� E-mail:1561061182@qq.com
 * @date ����ʱ�䣺2017��11��8�� ����6:44:32
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class HashMapTest {

	public static void main(String[] args) {
		//HashMap ������ �洢����
		HashMap<County, String> hashMap = new HashMap<County,String>();
		County china=new County("china", 15);
		County japan=new County("japan", 3);
		County England=new County("England ", 4);
		hashMap.put(china, "beijing");
		hashMap.put(japan, "Tokgo");
		hashMap.put(England, "lundun");
		
		String string = hashMap.get(china);
		System.out.println(string);
		
		String string1= hashMap.get(japan);
		System.out.println(string1);
		String string2 = hashMap.get(England);
		System.out.println(string2);
	Iterator<Entry<County, String>> iterator = hashMap.entrySet().iterator();
	while (iterator.hasNext()) {
		Entry<County, String> entry = iterator.next();
		String value = entry.getValue();
		County key= entry.getKey();
		System.out.println(value.toString()+""+key);
		
	}
	}

}
