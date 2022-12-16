package javaPractice.ch_12.garbage;

public class String_TrimMethod {

	public static void main(String[] args) {
		/* 문자열 앞 뒤 공백 잘라내는 메소드 
		trim() 메소드는 문자열 앞 뒤 공백을 제거한 새로운 문자열을 생성 & 리턴 */
		
		String tel1 = "      20";
		String tel2 = "000     ";
		String tel3 = "  0909  ";
		
		String tel = tel1.trim() + tel2.trim() + tel3.trim();
		System.out.println(tel);

	}

}
