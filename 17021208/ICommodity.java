package com.test;

import java.util.ArrayList;
import java.util.Scanner;

public interface ICommodity {
/*������Ʒ
2   ����
3   ����
4   �ο����*/
		void addCommodity(ArrayList<Commodity>arrayList,Scanner sc );
		void stockCommodity(ArrayList<Commodity>arrayList,Scanner sc );
		void sellCommodity(ArrayList<Commodity>arrayList,Scanner sc );
		void findCommodity(ArrayList<Commodity>arrayList,String name );
		void infoCommodity(ArrayList<Commodity>arrayList);
}
