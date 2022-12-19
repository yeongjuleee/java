package javaPractice.ch_18.input_output;

import java.io.FileInputStream;
import java.io.IOException;

/*
 	InputStream : ����Ʈ ������ �д� ��Ʈ�� �� �ֻ��� ��Ʈ��
 	
 	InputStream �� ���� ��Ʈ��
 		- FileInputStream : ���Ͽ��� ����Ʈ ������ �ڷḦ ����
 		- ByteArrayInputStream :  Byte �迭 �޸𸮿��� ����Ʈ ������ �ڷḦ ����
 		- FilterInputStream : ��� ��Ʈ������ �ڷḦ ���� �� �߰� ����� �����ϴ� ���� ��Ʈ���� ���� Ŭ����
 		
 	InputStream���� �����ϴ� �޼ҵ�
 		- int read() : �Է� ��Ʈ�����κ��� �� ����Ʈ�� �ڷḦ ����. ���� �ڷ��� ����Ʈ ���� ��ȯ
 		- void close() : �Է� ��Ʈ���� ����� ��� ���ҽ��� ����.
 */

public class Example03 {

	public static void main(String[] args) {
		
		/*
		 	FileInputStream :
		 	���Ͽ��� ����Ʈ ������ �ڷḦ ���� �� ����ϴ� ��Ʈ�� Ŭ����
		 	
		 		- FileInputStream(String name) : ���� �̸� name (��� ����)�� �Ű� ������ �޾� �Է� ��Ʈ���� ����
		 		- FileInputStream(File f) : File Ŭ���� ������ �Ű������� �޾� �Է� ��Ʈ���� ����
		 */
		
		FileInputStream fis = null;
		
		
		try {
			fis = new FileInputStream("./sample_file/input.txt");
			
			// read() �޼ҵ��� ��ȯ���� int. �� ����Ʈ�� �о int�� ����. 
			// �� �̻� �о� ���� �ڷᰡ ���� ��� -1 ��ȯ
			System.out.println((char)fis.read());	// A
			System.out.println((char)fis.read());	// B
			System.out.println((char)fis.read());	// C
			System.out.println((char)fis.read());	// D
			
		}
		catch (IOException e) {
			System.out.println(e);
		}
		finally {
			try {
				if (fis != null) {
					fis.close();	// ���� ��Ʈ���� finally ��Ͽ��� ����
				}
			}
			catch (IOException | NullPointerException e) {
				System.out.println(e);
			}
			// ��Ʈ���� null�� ���
		}

	}

}
