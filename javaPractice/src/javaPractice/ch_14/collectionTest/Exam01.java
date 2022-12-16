package javaPractice.ch_14.collectionTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javaPractice.ch_14.collection_Member.Member;

/*
	HashSEt�� Student ��ü�� �����Ϸ��� �Ѵ�
	�й��� ������ ������ Student��� �����ϰ�, �ߺ� ������ ���� �ʵ��� �϶�
	Student Ŭ������ ������
*/

class Student {
	// �ʵ�(�Ӽ�)
	String name;	// �̸�
	int studentNum; // �й�
	
	// ������
	public Student(int studentNum, String name) {
		this.name = name;
		this.studentNum = studentNum;
	}

	@Override
	public int hashCode() {
		return this.studentNum;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student student = (Student)obj;
			if( this.studentNum == student.studentNum)
				return true;
			else return false;
		}
		return false;
	}

	
	
}

public class Exam01 {

	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		
		set.add(new Student(1, "������"));
		set.add(new Student(2, "���ر�"));
		set.add(new Student(1, "��Ʈ��"));	// �й��� ���Ƽ� ���� X
		
		Iterator<Student> iterator = set.iterator();
		while (iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student.studentNum + "-" + student.name);
		}

	}

}
