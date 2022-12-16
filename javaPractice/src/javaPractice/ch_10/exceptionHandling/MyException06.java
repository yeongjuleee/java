package javaPractice.ch_10.exceptionHandling;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Date;


public class MyException06 {

	public static void main(String[] args) {
		PrintStream ps = null;			// 파일 error.log에 출력할 준비
		FileOutputStream fos = null;	// 파일 저장을 위함
		
		
		try {
			fos = new FileOutputStream(".\\output_file\\error.log", true);
										// error.log를 저장할 폴더 위치, true 를 하면 시간이 계속해서 새로고침됨
			ps = new PrintStream(fos);
			System.setErr(ps);
			
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(0/0);	// 예외 발생!
			System.out.println(4);		// 실행 X
		}
		
		catch (Exception ae) {
			System.err.println("------------------------------------------------");
			System.err.println("예외 발생시간 : " + new Date());	// 현재 시간 출력
			ae.printStackTrace(System.err);
			System.err.println("예외 메시지 : " + ae.getMessage());		// 화면 대신 error.log파일에 출력
			System.err.println("------------------------------------------------");
		}	// try-catch 끝
		System.out.println(6);

	}

}
