package javaPractice.ch_08.inheritancePolymorphismExample;

class Robot {
	
}

class DanceBot extends Robot {
	void dance() {
		System.out.println("춤을 춥니다.");
	}
}

class SingBot extends Robot {
	void sing() {
		System.out.println("노래를 합니다.");
	}
}

class DrawBot extends Robot {
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}

public class Example03 {
	// 1. instanceof 를 사용해서 action 메소드를 작성하라
	// instanceof 연산자 : a instanceof B : a 는 B의 객체이다.
	public static void action(Robot r) { // Robot r은 DanceBot의 객체이다.
		if (r instanceof DanceBot) {
			DanceBot dr = (DanceBot)r; // 부모타입에서 자식 타입으로 대입할 때 
			dr.dance();
		}
		else if(r instanceof SingBot) {
			SingBot sr = (SingBot)r;
			sr.sing();
		}
		else if(r instanceof DrawBot) {
			DrawBot dr = (DrawBot) r;
			dr.draw();
		}
		
	}
	
	
	public static void main(String[] args) {
		Robot[] arr = {new DanceBot(), new SingBot(), new DrawBot() };
		
		for (int i = 0; i < arr.length; i++)
			action(arr[i]);
				
	}

}
