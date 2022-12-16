package javaPractice.ch_09.abstractClass.Interface;

// 인터페이스에는 변수를 사용할 수 없고, 상수(변할 수 X)만 쓸 수 있음
interface Skinnable { // 인터페이스 상수 사용 예
	int BLACK = 0;		// 검정	// public static final
	int RED = 1;		// 빨강	
	int GREEN = 2;		// 초록
	int BLUE = 3;		// 파랑
	int LEOPARD = 4;	// 표범무늬
	
	void changeSkin(int skin);	// 스킨 변경	// public abstract
}

class PortablePlayer implements Player, Skinnable {
	private int skin = BLACK;

	public PortablePlayer() { }	// 생성자
	
	

	@Override
	public void play() {
		System.out.println("◆ 재생 시작!");
		
	}

	@Override
	public void stop() {
		System.out.println("◆ 재생 종료!");
		
	}
	
	@Override
	public void changeSkin(int skin) {
		System.out.print("스킨을 ");
		switch(skin) {
		case BLACK: System.out.print("검정");		break;
		case RED:	System.out.print("빨강");		break;
		case GREEN:	System.out.print("초록");		break;
		case BLUE:	System.out.print("파랑");		break;
		case LEOPARD:	System.out.print("표범 무늬");		break;
		default:	System.out.print("기본값");		break;
		}
		System.out.println("(으)로 변경했습니다.");
		
	}
}

public class Interface05 {

	public static void main(String[] args) {
		PortablePlayer a = new PortablePlayer();
		a.play();			// 재생
		a.stop(); 			// 정지
		//System.out.println(Skinnable.LEOPARD);
		a.changeSkin(Skinnable.LEOPARD);	// 스킨을 표범 무늬로 변경
	}

}
