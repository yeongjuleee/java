package javaPractice.ch_18.input_output;

import java.io.FileOutputStream;
import java.io.IOException;

public class Example07_2 {

	public static void main(String[] args) {
		/*
			 write(byte[] b, int off, int len) 메소드 사용하기
			 배열의 전체 자료를 출력하지 않고 배열의 off위치부터 len 길이만큼만 출력
		*/
		try(FileOutputStream fos = new FileOutputStream("./output_file/output3.txt")) {
			byte[] bs = new byte[26];
			byte data = 65;	// 'A' 아스키 값
			
			for(int i = 0; i < bs.length; i++) {	// A~Z 까지 배열 넣기
				bs[i] = data;
				data++;
			}
			fos.write(bs, 2, 10);	// 배열의 2번째 위치부터 10개 바이트 출력하기
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");


	}

}
