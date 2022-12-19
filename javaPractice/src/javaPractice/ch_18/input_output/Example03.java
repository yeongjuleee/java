package javaPractice.ch_18.input_output;

import java.io.FileInputStream;
import java.io.IOException;

/*
 	InputStream : 바이트 단위로 읽는 스트림 중 최상위 스트림
 	
 	InputStream 의 하위 스트림
 		- FileInputStream : 파일에서 바이트 단위로 자료를 읽음
 		- ByteArrayInputStream :  Byte 배열 메모리에서 바이트 단위로 자료를 읽음
 		- FilterInputStream : 기반 스트림에서 자료를 읽을 때 추가 기능을 제공하는 보조 스트림의 상위 클래스
 		
 	InputStream에서 제공하는 메소드
 		- int read() : 입력 스트림으로부터 한 바이트의 자료를 읽음. 읽은 자료의 바이트 수를 반환
 		- void close() : 입력 스트림과 연결된 대상 리소스를 닫음.
 */

public class Example03 {

	public static void main(String[] args) {
		
		/*
		 	FileInputStream :
		 	파일에서 바이트 단위로 자료를 읽을 때 사용하는 스트림 클래스
		 	
		 		- FileInputStream(String name) : 파일 이름 name (경로 포함)을 매개 변수로 받아 입력 스트림을 생성
		 		- FileInputStream(File f) : File 클래스 정보를 매개변수로 받아 입력 스트림을 생성
		 */
		
		FileInputStream fis = null;
		
		
		try {
			fis = new FileInputStream("./sample_file/input.txt");
			
			// read() 메소드의 반환형은 int. 한 바이트를 읽어서 int에 저장. 
			// 더 이상 읽어 내릴 자료가 없는 경우 -1 반환
			System.out.println((char)fis.read());	// A
			System.out.println((char)fis.read());	// B
			System.out.println((char)fis.read());	// C
			System.out.println((char)fis.read());	// D
			
		}
		catch (IOException e) {
			System.out.println(e);
		}
		finally {
			try {
				if (fis != null) {
					fis.close();	// 열린 스트림은 finally 블록에서 닫힘
				}
			}
			catch (IOException | NullPointerException e) {
				System.out.println(e);
			}
			// 스트림이 null인 경우
		}

	}

}
