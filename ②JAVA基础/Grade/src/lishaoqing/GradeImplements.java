package lishaoqing;

import java.util.ArrayList;
import java.util.Scanner;

public class GradeImplements implements IGrade {

	void help() {
		System.out.println("----�߿�����ϵͳ----");
		System.out.println("1	¼�뿼���ĸ߿���Ϣ");
		System.out.println("2	��ʾ���п�����Ϣ");
		System.out.println("3	��ѯ��߷�, ����: �ܷ���߷� �� ������߷�");
		System.out.println("4	�˳�����");
	}

	@Override
	public void add(ArrayList<Grade> arrayList, Scanner sc) {

		String s = sc.next();
		String[] arr = s.split(",");
		if (arr.length != 5) {
			System.out.println("������ĸ�ʽ����");
		} else {
			Grade g = new Grade();
			g.setName(arr[0]);
			g.setNumber(arr[1]);
			g.setLanguage(Double.parseDouble(arr[2]));
			g.setMath(Double.parseDouble(arr[3]));
			g.setEnglish(Double.parseDouble(arr[4]));
			// g.setScore(Double.parseDouble(arr[5]));

			arrayList.add(g);

			System.out.println(g.toString());
		}
	}

	@Override
	public void info(ArrayList<Grade> arrayList) {
		// TODO Auto-generated method stub
		for (Grade grade : arrayList) {
			System.out.println(grade.toString());
		}
	}

	@Override
	public void max(ArrayList<Grade> arrayList, Scanner sc) {
		System.out.println("---��߷ֲ�ѯϵͳ---");
		System.out.println("�������Ӧ����ָ�");
		System.out.println("1  ��ѯ������߷�");
		System.out.println("2  ��ѯ��ѧ��߷�");
		System.out.println("3  ��ѯӢ����߷�");
		System.out.println("4  �˳�");

		boolean isexit = true;
		while (isexit) {
			int nextInt = sc.nextInt();
			switch (nextInt) {
			case 1:
				double maxLanguage = 0;

				for (int i = 0; i < arrayList.size(); i++) {
					double language = arrayList.get(i).getLanguage();

					if (language > maxLanguage) {
						maxLanguage = language;
					}
				}
				System.out.println("������߷�Ϊ��" + maxLanguage);

				break;
			case 2:
				double maxMath = 0;

				for (int i = 0; i < arrayList.size(); i++) {
					if (arrayList.get(i).getMath() > maxMath) {
						maxMath = arrayList.get(i).getMath();
					}
				}
				System.out.println("��ѧ��߷�Ϊ��" + maxMath);
				break;
			case 3:
				double maxEnglish = 0;
				for (int i = 0; i < arrayList.size(); i++) {
					if (arrayList.get(i).getEnglish() > maxEnglish) {
						maxEnglish = arrayList.get(i).getEnglish();
					}
				}
				System.out.println("Ӣ����߷�Ϊ��" + maxEnglish);
				break;
			case 4:
				isexit = false;
				break;
			default:
				break;
			}
		}
		System.out.println("�����˳���߷ֲ�ѯϵͳ");
	}

}
