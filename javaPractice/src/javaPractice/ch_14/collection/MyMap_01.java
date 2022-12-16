package javaPractice.ch_14.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// �̸��� key�� ������ value�� �����ϱ�
public class MyMap_01 {
	public static void main(String[] args) {
		// Map �÷��� ����
		Map<String, Integer> map = new HashMap<String, Integer>();
		// <String, Integer> => String�� Ű��, Integer�� ������ ���
		
		// ��ü ����
		map.put("���ر�", 80);
		map.put("������", 85);
		map.put("������", 90);
		map.put("������", 95);
		// key�� ���� ������ ���� ������ ������ ������ ��ü 
		System.out.println("�� Entry �� : " + map.size());
		
		// ��ü ã��
		// �̸�(key)���� ����(value) �˻�
		System.out.println("\t������ : " + map.get("������"));	// key�� ���� �� �Է�
		System.out.println();
		
		// ��ü �ϳ��� ó��
		Set<String> keySet = map.keySet();	// KeySet() : ��� Ű�� Set ��ü�� ��Ƽ� ����. Key Set ���
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) { // �ݺ�(Set�� �ε��� �� X => forEach �Ǵ� while)�ؼ� Ű�� ��� ���� Map���� ��
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		// forEach���� ����� ���
		for(Map.Entry<String, Integer> entry: map.entrySet()) {
			String strKey = entry.getKey();
			Integer intValue = entry.getValue();
			System.out.println(strKey + " : " + intValue);
		}
		System.out.println();
		
		// ��ü ����
		map.remove("������");	// Ű�� Map.Entry ����
		System.out.println("�� Entry �� : " + map.size());	// �� Entry �� : 2
		
		// ��ü�� �ϳ��� ó��
		// entrySet() : Ű�� ���� ������ ������ ��� Map.Entry ��ü�� Set�� ��� ����
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();	// Map.Entry Set ���
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		// ��ü ��ü ����
		map.clear();
		System.out.println("�� Entry �� : " + map.size()); // �� Entry �� : 0
		

	}

}
