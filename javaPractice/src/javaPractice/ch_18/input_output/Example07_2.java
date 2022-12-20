package javaPractice.ch_18.input_output;

import java.io.FileOutputStream;
import java.io.IOException;

public class Example07_2 {

	public static void main(String[] args) {
		/*
			 write(byte[] b, int off, int len) �޼ҵ� ����ϱ�
			 �迭�� ��ü �ڷḦ ������� �ʰ� �迭�� off��ġ���� len ���̸�ŭ�� ���
		*/
		try(FileOutputStream fos = new FileOutputStream("./output_file/output3.txt")) {
			byte[] bs = new byte[26];
			byte data = 65;	// 'A' �ƽ�Ű ��
			
			for(int i = 0; i < bs.length; i++) {	// A~Z ���� �迭 �ֱ�
				bs[i] = data;
				data++;
			}
			fos.write(bs, 2, 10);	// �迭�� 2��° ��ġ���� 10�� ����Ʈ ����ϱ�
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("����� �Ϸ�Ǿ����ϴ�.");


	}

}
