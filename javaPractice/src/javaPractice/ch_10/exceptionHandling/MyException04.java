package javaPractice.ch_10.exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MyException04 {

	public static void main(String[] args) {
		
		String path=".\\sample_file\\test2.txt";
		
		try {
			FileInputStream fis = new FileInputStream(path);
			System.out.println("파일 열기 성공");
		} catch(FileNotFoundException e) {
			// 다형성을 이용한 예외 처리
			System.out.println("*** FileNotFoundException ***");
			// e.printStackTrace();
		} catch (IOException e) {
			System.out.println("*** IOException ***");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("*** Exception ***");
			e.printStackTrace();
			// 얘를 가장 위에 올리면, 예외가 발생하고 순차적으로 확인을 하는데, 
			// 얘를 가장 먼저 확인하는데, 얘한테 모든 예외 발생이 있어서 다음 순서로 오는 애들은 
			// 실행되지 X
		}
		finally {
			System.out.println("프로그램 종료");
		}

	}

}
