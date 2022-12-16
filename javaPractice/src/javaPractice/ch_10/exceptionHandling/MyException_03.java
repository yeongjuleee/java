package javaPractice.ch_10.exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MyException_03 {

	public static void main(String[] args) {
		String path = ".\\sample_file\\test.txt";	// �̽������� ���� \�� ����Ͽ� \\�� ��Ÿ��
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(path); // ���� �߻� ����
			System.out.println("������ ��ο� ������ �����մϴ�.");
			
		} catch(FileNotFoundException e) {
			// ������ ã�� ���Ѵٴ� ���� ���� ��: FileNotFound
			System.out.println("������ ��ο� ������ �������� �ʽ��ϴ�.");
		} finally {
			if (fis != null) { 
				try {
					fis.close();
					// ������ �ݾ���
				} catch (IOException e) {;}
				System.out.println("������ �ݾҽ��ϴ�.");
			}
			System.out.println("�ڿ��� �����ϰ� �����մϴ�.");
		}

	}

}
