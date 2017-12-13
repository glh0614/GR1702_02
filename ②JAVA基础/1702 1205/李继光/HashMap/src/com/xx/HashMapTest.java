package com.xx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapTest {

	public static void main(String[] args) {
		//HashMap  ������ �洢����
		//��ͼ��ĳ�����ꡪ��>�����ϵ�һ���ط�
		//�绰����һ�����֡���>��Ӧһ���ֻ���
		//���֤�š���>Ψһ��Ӧ���Լ�
		//ӳ��   key ������>value ֵ
		//k��v  ��������������
		//key�����ظ���value�����ظ�
		//key��value����Ϊ��
		HashMap<Country, String> hashMap = new HashMap<Country, String>();
		Country China = new Country("China", 15);
		Country India = new Country("India", 12);
		Country Japan = new Country("Japan", 2);
		//ͨ��put������map
		hashMap.put(China, "beijing");
		hashMap.put(India, "Delhi");
		hashMap.put(Japan, "Tokyo");
		
		//ͨ��get�����ü�key�ҵ�value
		/*String string01 = hashMap.get(China);
		System.out.println(string01);
		String string02 = hashMap.get(India);
		System.out.println(string02);
		String string03 = hashMap.get(Japan);
		System.out.println(string03);
		*/
		//������������
		Iterator<Entry<Country, String>> iterator = hashMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Country, String> entry = iterator.next();
			String value = entry.getValue();
			Country key = entry.getKey();
			System.out.println(key.toString()+""+value);
		}
	} 
}
