package javaPractice.ch_18.input_output;

import java.io.IOException;

public class Example02 {

	public static void main(String[] args) {
		// ǥ�� �����
		// ȭ�鿡 ����ϰ� �Է¹޴� ǥ�� ����� Ŭ����
		
		// ���� ���� ���� �Է� �ޱ�
		System.out.println("���ĺ� ���� ���� ���� [Enter]�� ��������");
		
		int i;
		
		try {
			// read() �� ��ȯ���� int 
			while ((i = System.in.read()) != -1) { // System.in : ǥ�� �Է� ��Ʈ��
				System.out.print((char)i);	// System.out : ǥ�� ��� ��Ʈ��
			}
		} 
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
