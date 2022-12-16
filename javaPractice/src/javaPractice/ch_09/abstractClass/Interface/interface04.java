package javaPractice.ch_09.abstractClass.Interface;


interface Player { // 플레이어 인터페이스
	void play();
	void stop();
}

class VideoPlayer implements Player { // 비디오 플레이어
	private int id; // 제조번호
	private static int count = 0; // 현재까지 할당된 제조 번호.
								  // static 사용 => 객체 생성 필요 X
	
	public VideoPlayer() {	// 생성자
		id = ++count;
	}

	@Override
	public void play() {
		System.out.println("■ 비디오 재생 시작!");
		
	}

	@Override
	public void stop() {
		System.out.println("■ 비디오 재생 종료!");
		
	}
	
	public void printInfo() { // 제조 번호 표시
		System.out.println("이 기계의 제조 번호는 [" + id + "] 입니다.");
	}
	
	
}

class CDPlayer implements Player { // CD플레이어

	@Override
	public void play() {
		System.out.println("□ CD 재생 시작!");
		
	}

	@Override
	public void stop() {
		System.out.println("□ CD 재생 종료!");
		
	} 
	
	public void cleaning( ) { // 헤드 청소
		System.out.println("헤드를 청소했습니다.");
	}
	
}

public class interface04 {

	public static void main(String[] args) {
		Player[] a = new Player[2];	// 인터페이스를 데이터 타입으로 하는 배열 생성
									// 인터페이스로 객체는 못 만들지만 데이터 타입으로 만들 수 있음
		a[0] = new VideoPlayer();	// 비디오 플레이어
		a[1] = new CDPlayer();		// CD 플레이어
		
		for(Player p : a) {			// for(데이터타입 변수 : 배열 a(얘를 돌림 => a의 개수만큼 반복함))
			p.play();	// 재생
			p.stop();	// 정지
			System.out.println();
		}
		
		VideoPlayer[] b = new VideoPlayer[4];	// 0 1 2 3 4 => 5개
		for(int i = 0; i < b.length; i++) {	// i가 0부터, b의 길이까지 반복. 한번 반복 할 때 마다 i++
			b[i] = new VideoPlayer();
		}
		b[b.length -1].printInfo();	// 이 기계의 제조 번호는 [5]입니다.
		// 5개 에서 -1 되어 4가 나올 것 같지만, 위에 Player p 라는 객체를 하나 더 생성해두었기 때문에 5임(?)
	}

}
