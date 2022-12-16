package javaPractice.ch_10.exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MyException04 {

	public static void main(String[] args) {
		
		String path=".\\sample_file\\test2.txt";
		
		try {
			FileInputStream fis = new FileInputStream(path);
			System.out.println("���� ���� ����");
		} catch(FileNotFoundException e) {
			// �������� �̿��� ���� ó��
			System.out.println("*** FileNotFoundException ***");
			// e.printStackTrace();
		} catch (IOException e) {
			System.out.println("*** IOException ***");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("*** Exception ***");
			e.printStackTrace();
			// �긦 ���� ���� �ø���, ���ܰ� �߻��ϰ� ���������� Ȯ���� �ϴµ�, 
			// �긦 ���� ���� Ȯ���ϴµ�, ������ ��� ���� �߻��� �־ ���� ������ ���� �ֵ��� 
			// ������� X
		}
		finally {
			System.out.println("���α׷� ����");
		}

	}

}
