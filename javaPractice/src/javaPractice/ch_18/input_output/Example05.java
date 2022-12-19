package javaPractice.ch_18.input_output;

import java.io.FileInputStream;
import java.io.IOException;

public class Example05 {

	public static void main(String[] args) {
		/*
			int read(byte[] b) 메소드로 읽기
			자료를 read() 메소드로 한 바이트씩 읽는 것보다 배열을 사용해서 한꺼번에 많이 읽으면 처리 속도가 훨씬 빠름
			read(btye[] b) 메소드는 선언한 바이트 배열의 크기만큼 한꺼번에 자료를 읽고, 읽은 자료의 수를 반환
		*/

		try(FileInputStream fis = new FileInputStream ("./sample_file/input.txt")) {
			
			byte[] bs = new byte[10];
			int i;
			while ((i = fis.read(bs)) != -1) {
				/*
					for (byte b : bs) {	// 되도록 forEach 할 수 있는 것은 forEach로 쓰기
						System.out.print((char)b);
					}
				*/
				for(int k = 0; k < i; k++ ) {
					System.out.print((char)bs[k]);
				}
				System.out.println(": " + i + "바이트 읽음");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}

}
