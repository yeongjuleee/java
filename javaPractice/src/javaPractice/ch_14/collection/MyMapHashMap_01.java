package javaPractice.ch_14.collection;

import java.util.HashMap;
import java.util.Map;

class Student { // 학번과 키가 같다면 동일한 키로 인식
	public int sno;		// 학번
	public String name;	// 이름
	
	// 생성자
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	@Override
	public int hashCode() {	// 학번과 이름이 같다면 동일한 값을 리턴
		return sno + name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {	// 학번과 이름이 같다면 true 반환
		if(obj instanceof Student) {	// obj가 Student의 객체라면,
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
		
		// 학번과 이름이 동일한 Student 키로 저장
		map.put(new Student(1, "박정우"), 95);
		map.put(new Student(1, "박정우"), 95);
		map.put(new Student(1, "박지훈"), 85);
		
		System.out.println("총 Entry 수 : " + map.size());
		// 저장된 총 Map.Entry 수 얻기
	}

}
