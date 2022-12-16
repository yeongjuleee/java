package javaPractice.ch_08.inheritancePolymorphismExample;

class Robot {
	
}

class DanceBot extends Robot {
	void dance() {
		System.out.println("���� ��ϴ�.");
	}
}

class SingBot extends Robot {
	void sing() {
		System.out.println("�뷡�� �մϴ�.");
	}
}

class DrawBot extends Robot {
	void draw() {
		System.out.println("�׸��� �׸��ϴ�.");
	}
}

public class Example03 {
	// 1. instanceof �� ����ؼ� action �޼ҵ带 �ۼ��϶�
	// instanceof ������ : a instanceof B : a �� B�� ��ü�̴�.
	public static void action(Robot r) { // Robot r�� DanceBot�� ��ü�̴�.
		if (r instanceof DanceBot) {
			DanceBot dr = (DanceBot)r; // �θ�Ÿ�Կ��� �ڽ� Ÿ������ ������ �� 
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
