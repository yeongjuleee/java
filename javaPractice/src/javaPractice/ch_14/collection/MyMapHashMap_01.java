package javaPractice.ch_14.collection;

import java.util.HashMap;
import java.util.Map;

class Student { // �й��� Ű�� ���ٸ� ������ Ű�� �ν�
	public int sno;		// �й�
	public String name;	// �̸�
	
	// ������
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	@Override
	public int hashCode() {	// �й��� �̸��� ���ٸ� ������ ���� ����
		return sno + name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {	// �й��� �̸��� ���ٸ� true ��ȯ
		if(obj instanceof Student) {	// obj�� Student�� ��ü���,
			Student student = (Student)obj;
			return (sno == student.sno) && (name.equals(student.name));
		}
		else {
			return false;
		}
	}
	
	
	
	
}

public class MyMapHashMap_01 {

	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		
		// �й��� �̸��� ������ Student Ű�� ����
		map.put(new Student(1, "������"), 95);
		map.put(new Student(1, "������"), 95);
		map.put(new Student(1, "������"), 85);
		
		System.out.println("�� Entry �� : " + map.size());
		// ����� �� Map.Entry �� ���
	}

}
