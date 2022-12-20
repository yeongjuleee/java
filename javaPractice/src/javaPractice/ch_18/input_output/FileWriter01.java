package javaPractice.ch_18.input_output;

import java.io.FileWriter;
import java.io.IOException;

/*
	Writer
	문자 단위로 출력하는 스트림 중 최상위 스트림.
	
	Writer 하위 클래스
	FileWriter : 파일에 문자 단위로 출력하는 스트림 클래스
	OutputStreamWriter : 파일에 바이트 단위로 출력한 자료를 문자로 변환해 주는 보조 스트림.
	BufferedWriter : 문자로 쓸 때 배열을 제공하여 한꺼번에 쓸 수 있는 기능을 제공해 주는 보조 스트림.
	
	Writer 제공 메서드
	void write(int c) : 한 문자를 파일에 출력
	void write(char[] buf) : 문자 배열 buf의 내용을 파일에 출력
	void write(char[] buf, int off, int len) : 문자 배열 buf의 off위치에서 len 개수의 문자를 파일에 출력.
	void write(string str) : 문자열 str을 파일에 출력
	void write(string str, int off, int len) : 문자열 str의 off번째 문자부터 len 개수 만큼 파일에 출력.
	void flush() : 출력을 위해 잠시 자료가 머무르는 출력 버퍼를 강제로 비워 자료를 출력 
	void close() : 출력 스크림과 연결된 대상 리소스를 닫음. 출력 버퍼도 비워짐.
*/

public class FileWriter01 {

	public static void main(String[] args) {
		/*
			 FileWriter
			 생성자를 사용해서 스트림을 생성
			 
			 FileWriter(Stirng name) : 파일 이름(경로 포함)을 매개변수로 받아 출력 스트림을 생성
			 FileWriter(String name, boolean append) : 파일 이름(경로 포함)을 매개변수로 받아 출력 스트림을 생성
			 append 값이 true 이면, 파일 스트림을 닫고 다시 생성할 때 파일의 끝에서 이어서 사용. 디폴트 값은 false'
			 
			FileWriter(file f) : File 클래스 정보를 매개변수로 받아 출력 스트림 생성
			FileWriter(String name, boolean append) : File 클래스 정보를 매개변수로 받아 출력 스트림을 생성
			append 값이 true이면 파일 스트림을 닫고, 다시 생성할 때 파일의 끝에서 이어서 사용. 디폴트 값은 false 
		*/
		
		try(FileWriter fw = new FileWriter("./output_file/writer.txt")) {
			fw.write('A'); 	// 문자 하나 출력
			char[] buf = {'B', 'C', 'D', 'E', 'F', 'G'};
			
			fw.write(buf);	// 문자 배열 출력
			fw.write("준규야, 생존은 하고 있지?");	// String 출력
			fw.write(buf, 1, 2);	// 문자 배열의 일부 출력
			fw.write("65");	// 숫자를 그대로 출력
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");

	}

}
