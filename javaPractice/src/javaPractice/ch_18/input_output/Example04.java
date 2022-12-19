package javaPractice.ch_18.input_output;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Example04 {

	public static void main(String[] args) {
		/*
		 	���� ������ �б�
		 	read() �޼ҵ�� ������ �д� ��� ������ ���� �����ϸ� -1�� ��ȯ
		 */
		
		try(FileInputStream fis = new FileInputStream("./sample_file/input.txt")) {
			int i;
			// i ���� -1�� �ƴ� ���� read() �޼ҵ�� �� ����Ʈ�� �ݺ��ؼ� ����
			while ((i = fis.read()) != -1) {
				System.out.println((char)i);
			}
			System.out.println("end");
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
