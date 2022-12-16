package javaPractice.ch_09.abstractClass.Interface;

/*
A 프로그래머와 B 프로그래머가 하나의 프로젝트를 진행했을 때,
A 프로그래머와 B 프로그래머가 서로의 클래스가 완성되지 않았어도,
구현해야 할 기능들을 미리 협의하고 반환 타입을 정해 놓으면 서로의 작업 정도와는 무관하게 진행 가능
바로 이런 약속과 같은 것 => "인터페이스"

아래 예제 KoreaTour, JapanTour, TorGuide 클래스를
3명이 각각 작업을 하고, 동시에 개발에 들어가는 것을 보면 인터페이스를 이해하기 쉬움

인터페이스를 미리 만들어서 가능하게 됨

즉, 작업 순서가
1. 인터페이스(구현할 기능 협의)
2. 동시에 3개의 클래스를 작업
*/

interface Providable { // 인터페이스
	void leisureSports(); // public abstract를 생략해도 java가 알아서 넣어준 상태
	void sightseeing();
	void food();
}

class KoreaTour implements Providable { // Providable의 자손 클래스 KoreaTour (자손인지 알 수 있는 단서: implements)

	@Override
	public void leisureSports() {
		System.out.println("한강 공원에서 자전거 타기");
		
	}

	@Override
	public void sightseeing() {
		System.out.println("케이팝 투어");
		
	}

	@Override
	public void food() {
		System.out.println("라끼돌 성지 순례");
		
	} 
	
}

class TourGuide {
	private Providable tour; // 인터페이스로 타입 선언
	TourGuide (Providable providable) {
		tour = providable;
		// 인터페이스도 다형성의 대상이 됨.
	}
	
	// 오버라이딩 아님!!!
	public void leisureSports() {
		tour.leisureSports();
	}
	
	public void sightseeing() {
		tour.sightseeing();
	}
	
	public void food() {
		tour.food();
	}
}

public class Interface01 {

	public static void main(String[] args) {
		TourGuide guide = new TourGuide(new KoreaTour());
		guide.leisureSports();
		guide.sightseeing();
		guide.food();
		System.out.println();

	}

}
