package hashMap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class KeySetDemo {
	public static void main(String[] args) {
		// String Ÿ���� Ű�� Integer Ÿ���� ����� �̷���� ��
		// Map�� �������̽�, HashMap�� Map�� ������ Ŭ����
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("�迬��", new Integer(98));	// int Ÿ���� �ʿ� ���� �� ����
		map.put("�ƻ�ٸ���", new Integer(60));
		map.put("��Ʈ���ڹ�", new Integer(30));
		// ����� Iterator ������ �����. �׷��� Set �� �̿��Ѵ�
		// ���� ���� ����ϴ� �ó�����
		// 1. Ű�� ����� ���� ��� entrySet()
		Set set = map.entrySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Map.Entry e = (Map.Entry) it.next();
		/*	System.out.println("������ : " + e.getKey()
					+ ", ���� : " + e.getValue());*/
			
		}
		// 2. Ű�� ����ϴ� ���
		set = map.keySet();
		// set �� toString() �� ���������� �������̵� �Ǿ��ִ�.
		// set �� �ε��� ���� �Է� ������ ���ֹ��� �ʴ´�.
		System.out.println("������ ��� : " + set);
		
		// 3. ����� ����ϴ� ���
		Collection values = map.values();
		Iterator it2 = values.iterator();
		int total = 0;	// �� ��ȸ�� ����ۼ��� ��
		while (it2.hasNext()) {
			Integer i = (Integer) it2.next();
			total += i.intValue();	// �� �������� ������ �հ�� 
		}
		System.out.println("��� : " + total/set.size());
		System.out.println("�ְ��� : " + Collections.max(values));
		System.out.println("������ : " + Collections.min(values));
		// Collection : �������̽�
		// Collections : Ŭ����
	}
}
