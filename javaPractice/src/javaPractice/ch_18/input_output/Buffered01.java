package javaPractice.ch_18.input_output;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
	Buffered 스트림
	입술력이 한 바이트나 혼자 단위로 이루어지면 그 만큼 프로그램 수행속도가 느림.
	Buffered 스트림은 내부적으로 8,192바이트 크기의 배열을 가지고 있으며 
	이미 생성된 스트림에 배열 기능을 추가해 더 빠르게 입출력을 실행할 수 있는 버퍼링 기능을 제공.
	당연히 한 바이트나 한 문자 단위로 처리할 때 보다 훨씬 빠르게 처리 할 수 있음.
	
	BufferedInputStream : 바이트 단위로 읽는 스트림에 버퍼링 기능을 제공
	BufferedOutputStream : 바이트 단위로 출력하는 스트림에 버퍼링 기능을 제공
	BufferedReader : 문자 단위로 읽는 스트림에 버퍼링 기능을 제공
	BufferedWriter : 문자 단위로 출력하는 스트림에 버퍼링 기능을 제공
	
	버퍼링을 제공하는 스트림 역시 보조 스트림으로 다른 스트림을 포함하여 수행.
	BufferedInputStream(InputStream in) : InputStream 클래스를 생성자의 매개변수로 받아 BufferedInputStream을 생성.
	BufferedInputStream(InputStream in, int size) : : InputStream 클래스와 버퍼 크기를 생성자의 매개변수로 받아 BufferedInputStream.
*/


public class Buffered01 {

	public static void main(String[] args) {
		// 파일 복사하기
		long millisecond = 0;
		
		try(FileInputStream fis = new FileInputStream("./sample_file/a.zip");
			FileOutputStream fos = new FileOutputStream("./output_file/copy.zip")) {
			// 보조 기반이기때문에 생성자를 만들어줘야함.
			
			
			millisecond = System.currentTimeMillis();	// 파일 복사 시작하기 전 시간
			
			int i;
			while ( (i = fis.read()) != -1) {
				fos.write(i);
			}
			
			millisecond = System.currentTimeMillis() - millisecond;	// 파일을 복사하는데 걸리는 시간
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("파일을 복사하는 데 " + millisecond + "milliseconds 소요되었습니다." );

	}

}
