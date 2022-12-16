package javaPractice.ch_14.collectionTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javaPractice.ch_14.collection_Member.Member;

/*
	HashSEt에 Student 객체를 저장하려고 한다
	학번이 같으면 동일한 Student라고 가정하고, 중복 저장이 되지 않도록 하라
	Student 클래스를 만들어라
*/

class Student {
	// 필드(속성)
	String name;	// 이름
	int studentNum; // 학번
	
	// 생성자
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
		
		set.add(new Student(1, "박지훈"));
		set.add(new Student(2, "김준규"));
		set.add(new Student(1, "김트메"));	// 학번이 같아서 저장 X
		
		Iterator<Student> iterator = set.iterator();
		while (iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student.studentNum + "-" + student.name);
		}

	}

}
