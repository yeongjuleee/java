package javaPractice.ch_01;

public class Prologue01 {

	public static void main(String[] args) {
		// 기본으로 실행할 내용을 여기에 적으시오~ 하는 main
		System.out.println("Hello Java!"); // println 이 함수처럼 사용. (함수가 곧 메소드임 그으런데 함수 앞에 . 붙는..) 
		System.out.println("예뻤어 - DAY6");
		System.out.println("비주얼 스튜디오가 왜 비주얼인지 알것같은 느낌적인 느낌!");
		// 얘는 한줄 주석이구여		

		/*
		얘는 여러줄 주석이에요!
		한번에 들여쓰기 등을 하는 방법: 모두 드래그해서 탭하기 (뒤로 백해야할땐 쉬프트 + 탭)
		 */		
		
		// java는 꼭 코드가 끝나면 ; (세미클론)을 붙이고! 문자열에는 꼭 큰 따옴표 " " 를 사용해야함!
		
		//"Hello Java를 변수에 저장해서 프린트해보자!
		String greet = "Hello Java!";
		System.out.println(greet);
		
		String soon = "곧 신이 만든 시간";
		System.out.println(soon);
		
		// char 타입 사용해보기
		char ch = 'A'; // char ch = '\u0041'; 로 바꿔 써도 같다.
		int code = (int)ch;
		
		System.out.println(ch); // A
		System.out.println(code); // 65
		
		//char 타입으로 소문자 a의 값 출력해보기
		char kode = 'a';
		
		System.out.println(kode);
		
		//문자열 표현
		char single = '\'';	 // 작은 따옴표를 출력하려면 백슬래쉬\ 뒤에 ' 입력
		String dblQuote = "\"Hello\""; //겹따옴표를 출력하려면 백슬래쉬\ 뒤에 " 를 입력
		String root = "c:\\";
		
		System.out.println(single);
		System.out.println(dblQuote);
		System.out.println(root);
		
		
		//실수타입(float) 해보기
		float f = 1.234567890123456789f;
		float f3 = 1.2f; 
		
		//실수타입(duble) 해보기
		double d = 1.234567890;
		
		System.out.println(f);
		System.out.println(f3);
		System.out.println(d);
		
		// 정수타입 (long) 사용할 경우, int의 범위를 벗어났을 때 접미사 L 사용
		long var1 = 10;
		long var2 = 20L;
		long var3 = 100000000L;
		long var4 = 1000000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
	}

}
