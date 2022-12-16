package javaPractice.ch_09.abstractClass.Interface;

class JapanTour implements Providable {

	@Override
	public void leisureSports() {
		System.out.println("도쿄타워 번지 점프 투어");
		
	}

	@Override
	public void sightseeing() {
		System.out.println("오사카 관람 투어");
		
	}

	@Override
	public void food() {
		System.out.println("초밥 투어");
		
	}
	
}

public class Interface02 {

	public static void main(String[] args) {
		
		TourGuide guide2 = new TourGuide(new JapanTour());
		guide2.leisureSports();
		guide2.sightseeing();
		guide2.food();
		System.out.println();
	}

}
