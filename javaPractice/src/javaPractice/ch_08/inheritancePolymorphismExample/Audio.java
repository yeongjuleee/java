package javaPractice.ch_08.inheritancePolymorphismExample;

// 새로 추가된 클래스
public class Audio extends Product {
	Audio() {
		super(50);
	}
	
	@Override
	public String toString() {
		return "Audio";
	}

}
