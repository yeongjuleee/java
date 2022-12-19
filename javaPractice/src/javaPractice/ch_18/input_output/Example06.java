package javaPractice.ch_18.input_output;

import java.io.FileOutputStream;
import java.io.IOException;

/*
	OutputStream : 바이트 단위로 쓰는 스트림 중 최상위 스트림.
	자료 출력 대상에 따라 다른 스트림을 제공.
		- FileOutputStream : 바이트 단위로 파일에 자료를 씀
		- ByteArrayOutputStream : Byte 배열에 바이트 단위로 자료를 씀
		- FilterOutputStream : 기반 수트림에서 자료를 쓸 때 추가 기능을 제공하는 보조 스트림의 상위 클래스
	
	OutputStream에서 제공하는 메소드
		- void write(int b) : 한 바이트를 출력
		- void write(byter[] b) : b[] 배열에 있는 자료를 출력
		- void flush() : 출력을 위해 잠시 자료가 머무르는 출력 버퍼를 강제로 비워 자료를 출력
		- void close() : 출력 스크림과 연결된 대상 리소스를 닫음.
		  출력 버퍼가 비워짐 (예 : FileOutputStream인 경우 파일 닫음)
*/

public class Example06 {
	
	public static void main(String[] args) {
	/*
	    FileOutputStream : 파일에 바이트 단위 자료를 출력하기 위해 사용하는 스트림.
	
	    FileOutputStream(String name) : 파일 이름(경로 포함)을 매개변수로 받아 출력 스트림을 생성.
	    FileOutputStream(String name, boolean append) : 파일 이름(경로 포함)을 매개변수로 받아 출력 스트림을 생성.
	    append 값이 true이면 파일 스트림을 닫고 다시 생성할 때 파일의 끝에서 이어서 사용. 디폴트 값은 false.
	
	    FileOutputStream(File f) : File 클래스 정보를 매개변수로 받아 출력 스트림을 생성.
	    FileOutputStream(File f, boolean append) : File 클래스 정보를 매개변수로 받아 출력 스트림을 생성.
	    append 값이 true이면 파일 스트림을 닫고 다시 생성할 때 파일의 끝에서 이어서 사용. 디폴트 값은 false.
	
	    생성자 매개변수로 전달한 파일이 경로에 없으면 FileOutputStream은 파일을 새로 생성.
	    기존 파일이 있는 경우 append 값이 false이면 처음 부터 새로 씀. overwrite.
	    true이면 기존 내용 맨 뒤에 연결해서 씀. append
	    */

    //FileOutputStream을 생성하고 write()메서드를 활용하여 파일에 정수 값을 저장
    // fos = new FileOutputStream("output.txt", true) 기존 자료에 이어서 출력할 경우
	
	 try(FileOutputStream fos = new FileOutputStream("./sample_file/output.txt", true)) { // 출력하려는 파일 경로, true 하면 붙어서 한번 더 적어짐.
		 // 파일에 숫자를 쓰면 해당하는 아스키 코드 값으로 변환
		 fos.write(65);
		 fos.write(66);
		 fos.write(67);
		 fos.write(68);
		 fos.write(69);
		 fos.write(70);
	 }
	 catch(IOException e) {
		 e.printStackTrace();
	 }
	 System.out.println("출력이 완료되었습니다.");

	}
}