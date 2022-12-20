package javaPractice.ch_18.input_output;

import java.io.FileReader;
import java.io.IOException;

/*
	문자 단위 스트림
	Reader : 문자 단위로 읽는 스트림 중 최상위 스트림
	
	Reader 하위 스트림.
	FileReader : 파일에서 문자 단위로 읽은 스트림 클래스
	InputStreamReader : 바이트 단위로 읽은 자료를 문자로 변환해 주는 보조 스트림
	BufferedReader : 문자로 읽을 때 배열을 제공하여 한꺼번에 읽을 수 있는 기능을 제공해 주는 보조 스트림
	
	Reader 제공 메서드
	int read() : 파일로 부터 한 문자를 읽음. 읽은 값을 반환.
	int read(char[] buf) : 파일로 부터 buf 배열에 문자를 읽음.
	int read(char[] buf, int off, int len) : 파일로 부터 buf. 배열의 off 위치에서부터 len 개수 만큼 문자를 읽음.
	void close() : 스트림과 연결된 파일 리소스를 닫음.
*/

public class Example08 {

	public static void main(String[] args) {
		/*
			 FileReader
			 FileReader(String name) : 파일 이름 name(경로 포함)을 매개변수로 받아 입력 스트림을 생성
			 FileReader(File f) : File 클래스 정보를 매개변수로 받아 입력 스트림을 생성
			 
			 문자 스트림 FileReader로 읽으면 한글이 제대로 읽힘
 		*/
		try(FileReader fr = new FileReader("./sample_file/reader.txt")) {
			int i;
			while((i = fr.read()) != -1) {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
