package javaPractice.ch_09.abstractClass;

/*
HttpServlet 추상 클래스와 LoginServlet, FileDownloadServlet 클래스가 있습니다.
메인 클래스와 출력 결과를 보고 LoginServlet, FileDownloadServlet 클래스를 완성하세요.

출력 결과
로그인 합니다.
파일 다운로드 합니다.
*/

abstract class HttpServlet { // 추상 클래스
	public abstract void service();
}

class LoginServlet extends HttpServlet { // 추상 클래스 HttpServlet을 상속받는 LoginServlet 클래스
	// 부모에 생성자 X 메소드만 존재 => 메소드만 만들어서 이용 가능	

	@Override
	public void service() {
	System.out.println("로그인 합니다.");
	
	}
	
}

class FileDownloadServlet extends HttpServlet { // 추상 클래스 HttpServlet을 상속받는 FileDownloadServlet 클래스
	// 부모에 생성자 X 메소드만 존재 => 메소드만 만들어서 이용 가능	

	@Override
	public void service() {
		System.out.println("파일 다운로드 합니다.");
		
	}
	
	
}

public class AbstractMethod03 {

	public static void main(String[] args) {
		method(new LoginServlet());			// 로그인 합니다.
		method(new FileDownloadServlet());	// 파일 다운로드 합니다.

	}
	
	public static void method(HttpServlet servlet) {
		servlet.service();
	}

}
