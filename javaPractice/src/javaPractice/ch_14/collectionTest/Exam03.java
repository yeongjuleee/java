package javaPractice.ch_14.collectionTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// HashMap�� ���̵�(String)�� ����(Integer)�� ����Ǿ� �ִ�.
// ���� ����� ���� ��� ������ ����ϰ�, �ְ� ������ �ְ� ������ ���� ���̵� ����� ��
// ��� ���
// ��� ���� : 91
// �ְ� ���� : 96
// �ְ� ������ ���� ���̵� : blue

public class Exam03 {
	private static void print(String string, Integer value) {
	      System.out.println(string+" : " +value);
	      
	   }
	
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;	// �ְ� ������ ���� ���̵� ����
		int maxScore = 0;	// �ְ� ���� ����
		int totalScore = 0;	// ���� �հ� ����

		// �ۼ� ��ġ
		// ��Ʈ : �ݺ����� �̿��ϱ�! 
		// ��ƴٸ�, ���� ������ ���غ���! 
		
// ���� �� ��� (�����ڷ� : MyMap_01)
//		for(Map.Entry<String, Integer> entry : map.entrySet()) {	// �� ���� ���ϴ� �ݺ���
//			String strKey = entry.getKey();
//			Integer intValue = entry.getValue();
//			System.out.println(strKey + " : " + intValue);
//			totalScore += intValue;
//			
//			if (maxScore < intValue) {
//				maxScore = intValue;
//				name = strKey;
//			}
//				
//		}
//		System.out.println();
//		
//		print("��� ���� : ", totalScore / map.size());
//		print("�ְ� ���� : ", maxScore);
//		System.out.println("�ְ� ������ ���� ���̵� : " + name);
		
		
		// ����� ���
		Iterator<String> entrySet = map.keySet().iterator();
		while(entrySet.hasNext()) { // �ݺ��ؼ� Ű�� ��� ���� Map���� ��
			// key ���� set ������ �ٲٴ� ���� 1 ��. 
			String key = entrySet.next();
			int thisScore = map.get(key);
			totalScore += thisScore;
			if ( maxScore < thisScore) {
				maxScore = thisScore;
				name = key;
			}
		}
		System.out.println("��� ���� : " + totalScore / map.size());
		System.out.println("�ְ� ���� : " + maxScore);
		System.out.println("�ְ� ������ ���� ���̵� : " + name);
	}

}
