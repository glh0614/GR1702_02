package com.xx;

import java.util.ArrayList;
import java.util.Scanner;

public interface IArray {
	//�����Ʒ
	void addCommodity(ArrayList<Commodity> arrs,Scanner as);
	//��ʾ���е���Ʒ��Ϣ
	void infoCommodity(ArrayList<Commodity> arrs);
	//����
	void stock(ArrayList<Commodity> arrs, Scanner as);
	//����
	void sell(ArrayList<Commodity> arrs,Scanner as);
	
	
	
	
}
