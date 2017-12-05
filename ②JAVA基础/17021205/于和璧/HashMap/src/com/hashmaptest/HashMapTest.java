package com.hashmaptest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapTest {
	
	public static void main(String[] args) {
		
		HashMap<Country, String> hashMap = new HashMap<Country, String>();
		
		Country China = new Country("China", 15);
		Country india = new Country("india", 14);
		Country japan = new Country("japan", 2);
		
		//ͨ��put������Map����Ŷ���
		hashMap.put(China, "BeiJing");
		hashMap.put(india, "Delhi");
		hashMap.put(japan, "Tokyo");
		
		//ͬ��key�ҵ�value
		/*String string = hashMap.get(China);
		System.out.println(string);
		String string2 = hashMap.get(india);
		System.out.println(string2);
		String string3 = hashMap.get(japan);
		System.out.println(string3);
		*/
		//����,������
		
		Iterator<Entry<Country, String>> iterator = hashMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Country, String> entry = iterator.next();
			Country key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key.toString()+"�׶�: "+value);
			
		}
		
	}

}
