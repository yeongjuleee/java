package javaPractice.ch_08.inheritancePolymorphismExample;

public class RobotPet02 {
	// p가 참조하는 인스턴스에 자기소개를 시킨다.
	static void intro(Pet p) {
		p.introduce();
	}
	
	public static void main(String[] args) {
		// 배열을 활용하여 애완동물 클래스의 이용
		// 예시: 메소드의 인수로 다형성을 검증
		Pet[] a = {
				new Pet("본본", "준규"),
				new RobotPet("포동", "정환"),
				new Pet("우피", "정우"),
		};
		
		for(Pet p : a) { // forEach문 이용 앞에 요소, 뒤에 인덱스? 
						// forEach(요소,인덱스,...)
			
			intro(p);		// p가 참조하는 인스턴스에 자기소개를 시킨다
			System.out.println();
		}
	}

}
