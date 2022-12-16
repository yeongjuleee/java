package javaPractice.ch_10.exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MyException_03 {

	public static void main(String[] args) {
		String path = ".\\sample_file\\test.txt";	// 이스케이프 문자 \를 사용하여 \\로 나타냄
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(path); // 예외 발생 지정
			System.out.println("지정한 경로에 파일이 존재합니다.");
			
		} catch(FileNotFoundException e) {
			// 파일을 찾지 못한다는 예외 오류 명: FileNotFound
			System.out.println("지정한 경로에 파일이 존재하지 않습니다.");
		} finally {
			if (fis != null) { 
				try {
					fis.close();
					// 파일을 닫아줌
				} catch (IOException e) {;}
				System.out.println("파일을 닫았습니다.");
			}
			System.out.println("자원을 해제하고 종료합니다.");
		}

	}

}
