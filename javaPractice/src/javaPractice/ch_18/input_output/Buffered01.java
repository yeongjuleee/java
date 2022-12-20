package javaPractice.ch_18.input_output;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
	Buffered ��Ʈ��
	�Լ����� �� ����Ʈ�� ȥ�� ������ �̷������ �� ��ŭ ���α׷� ����ӵ��� ����.
	Buffered ��Ʈ���� ���������� 8,192����Ʈ ũ���� �迭�� ������ ������ 
	�̹� ������ ��Ʈ���� �迭 ����� �߰��� �� ������ ������� ������ �� �ִ� ���۸� ����� ����.
	�翬�� �� ����Ʈ�� �� ���� ������ ó���� �� ���� �ξ� ������ ó�� �� �� ����.
	
	BufferedInputStream : ����Ʈ ������ �д� ��Ʈ���� ���۸� ����� ����
	BufferedOutputStream : ����Ʈ ������ ����ϴ� ��Ʈ���� ���۸� ����� ����
	BufferedReader : ���� ������ �д� ��Ʈ���� ���۸� ����� ����
	BufferedWriter : ���� ������ ����ϴ� ��Ʈ���� ���۸� ����� ����
	
	���۸��� �����ϴ� ��Ʈ�� ���� ���� ��Ʈ������ �ٸ� ��Ʈ���� �����Ͽ� ����.
	BufferedInputStream(InputStream in) : InputStream Ŭ������ �������� �Ű������� �޾� BufferedInputStream�� ����.
	BufferedInputStream(InputStream in, int size) : : InputStream Ŭ������ ���� ũ�⸦ �������� �Ű������� �޾� BufferedInputStream.
*/


public class Buffered01 {

	public static void main(String[] args) {
		// ���� �����ϱ�
		long millisecond = 0;
		
		try(FileInputStream fis = new FileInputStream("./sample_file/a.zip");
			FileOutputStream fos = new FileOutputStream("./output_file/copy.zip")) {
			// ���� ����̱⶧���� �����ڸ� ����������.
			
			
			millisecond = System.currentTimeMillis();	// ���� ���� �����ϱ� �� �ð�
			
			int i;
			while ( (i = fis.read()) != -1) {
				fos.write(i);
			}
			
			millisecond = System.currentTimeMillis() - millisecond;	// ������ �����ϴµ� �ɸ��� �ð�
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("������ �����ϴ� �� " + millisecond + "milliseconds �ҿ�Ǿ����ϴ�." );

	}

}
