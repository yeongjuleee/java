package javaPractice.ch_18.input_output;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Buffered02 {

	public static void main(String[] args) {
		// ���۸� ������� ���� �����ϱ�
		long millisecond = 0;
		
		try(FileInputStream fis = new FileInputStream("./sample_file/a.zip");
			FileOutputStream fos = new FileOutputStream("./output_file/copy.zip");
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos)) {
			// ���� ����̱⶧���� �����ڸ� ����������.
			
			
			millisecond = System.currentTimeMillis();	// ���� ���� �����ϱ� �� �ð�
			
			int i;
			while ( (i = bis.read()) != -1) {
				bos.write(i);
			}
			
			millisecond = System.currentTimeMillis() - millisecond;	// ������ �����ϴµ� �ɸ��� �ð�
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("������ �����ϴ� �� " + millisecond + "milliseconds �ҿ�Ǿ����ϴ�." );

	}

}
