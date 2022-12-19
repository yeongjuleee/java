package javaPractice.ch_18.input_output;

import java.io.IOException;

/*
* 자바 입출력
자바에서 모든 입출력은 스트림 stream을 통해 이루어짐.
스트림이란 네트워크에서 유래된 용어로, 자료 흐름이 물의 흐름과 같다는 의미에서 사용.
자료를 읽어 들이려는 소스 source와 자료를 쓰려는 대상 target에 따라 각각 다른 스트림 클래스를 제공.

* 1) 입력 스트림과 출력 스트림
* 입력 스트림 : 어떤 대상으로부터 자료를 읽어 들일 때 사용.
* 스트림은 단방향으로 자료가 이동하기 때문에 입력과 출력을 동시에 할 수 없어서 저장할 때는 출력 스트림을 사용.

* 스트림의 이름을 보면 입력용인지 출력용인지 알수 있음.
* inputStrem이나 Reader로 끝나는 이름의 클래스는 입력 스트림
* 예) FileInputStream, FileReader, BufferedInputStream, BufferedReader 등
* OutputStream이나 Writer로 끝나는 이름의 클래스는 출력 스트림
* 예) FileOutputStream, FileWriter, BufferedOutputStream, BufferedWriter 등
*
* 2) 바이트 단위 스트림과 문자 단위 스트림
* 원래 자바의 스트림은 바이트 byte 단위로 자료의 입출력이 이루어짐.
* 하지만 문자의 경우 문자를 나타내는 char형은 2바이트이기 때문에 1바이트만 읽으면 한글같은 문자는 깨짐.
* 따라서 가장 많이 사용하는 자료인 문자를 위해 문자 스트림을 별도로 제공.
* 즉 읽어 들이는 자료형에 따라 바이트용과 문자용 스트림이 있음.
*
* 스트림 클래스의 이름이 Stream으로 끝나는 경우는 바이트 단위를 처리하는 스트림
* Reader나 Writer로 끝나는 이름은 문자를 위한 스트림 클래스.
*
* 바이트 스트림 : FileInputStream, FileOutputStream, BufferedInputStream, BufferedOutputStream 등
* 문자 스트림 : FileReader, FileWriter, BufferedReader, BufferedWriter 등

* 3) 기반 스트림과 보조 스트림
* 기반 스트림 : 자료를 직접 읽거나 쓰는 기능을 제공하는 스트림.
* 보조 스트림 : 자료를 직접 읽거나 쓰는 기능은 없이 다른 스트림에 부가 기능을 제공하는 스트림.
* 따라서 항상 다른 스트림을 포함하여 생성.

기반 스트림과 보조 스트림인가의 여부는 이름으로 판단은 어렵고, 자주 사용하는 클래스 위주로 기억.
기반 스트림 : FileInputStream, FileOutputStream, FileReader, FileWriter 등
보조 스트림 : InputStreamReader, OutputStreamReader, BufferedInputStream, , BufferedOutputStream 등

예 : FileInputStream의 경우 InputStream이니 입력 스트림이고, stream 이니 바이트 단위로 처리,
File에 직접 읽고 쓰는 기반 스트림.
 */

public class Example01 {

	public static void main(String[] args) {
		/*
		 	표준 입출력 : 화면에 출력하고 입력 받는 표준 입출력 클래스
		 	static PrintStream out : 표준 출력 스트림
		 	static InputStream in : 표준 입력 스트림
		 	static OutputStream err : 표준 오류 출력 스트림
		 */
		
		System.out.println("알파벳 하나를 쓰고 [Enter]를 누르렴");
		
		int i;
		try {
			// System.in : 표준 입력 스트림
			i = System.in.read();	// read() 메소드로 한 바이트 읽음
			// System.out : 표준 입력 스트림
			System.out.println(i);	// int는 4 바이트이지만, 1 바이트만 읽어서 출력. 아스키 코드를 출력
			System.out.println((char)i);
		}
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
