package javaPractice.ch_04;

public class Switch01 {

	public static void main(String[] args) {
		// Switch 문 : 하나의 조건식으로 많은 경우의 수를 처리하는 조건문
		// 일년 동안 읽은 책 수에 따라 멘트 출력하기
		
		int book = 15;
		book = book / 10;
		
		switch(book) {
		case 0: // 10권 미만
			System.out.println("조금 더 노력 하세요!");
			break;
		
		case 1: // 10권 이상 20권 미만
			System.out.println("책 읽는 것을 즐기시는 분이시네요!");
			break;
		
		case 2: // 20권 이상 30권 미만
			System.out.println("책을 사랑하는 분이시네요!");
			break;
			
		default: // 30권 이상
			System.out.println("당신은 다독왕입니다!");
		}
		
		// 메달에 따라 멘트 출력하기
		
		String medal = "Silver";
		// medal 이 Silver 일 때 해당되는 case로 가는 원리.
		
		switch(medal) {
		case "Gold":
			System.out.println("금메달 입니다.");
			break;
			
		case "Silver":
			System.out.println("은메달 입니다.");
			break;
			
		case "Bronze":
			System.out.println("동메달 입니다.");
			break;
			
		default:
			System.out.println("메달이 없습니다.");
			break;
		}

	}

}
