package javaPractice.ch_10.exceptionHandling;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Date;


public class MyException06 {

	public static void main(String[] args) {
		PrintStream ps = null;			// ���� error.log�� ����� �غ�
		FileOutputStream fos = null;	// ���� ������ ����
		
		
		try {
			fos = new FileOutputStream(".\\output_file\\error.log", true);
										// error.log�� ������ ���� ��ġ, true �� �ϸ� �ð��� ����ؼ� ���ΰ�ħ��
			ps = new PrintStream(fos);
			System.setErr(ps);
			
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(0/0);	// ���� �߻�!
			System.out.println(4);		// ���� X
		}
		
		catch (Exception ae) {
			System.err.println("------------------------------------------------");
			System.err.println("���� �߻��ð� : " + new Date());	// ���� �ð� ���
			ae.printStackTrace(System.err);
			System.err.println("���� �޽��� : " + ae.getMessage());		// ȭ�� ��� error.log���Ͽ� ���
			System.err.println("------------------------------------------------");
		}	// try-catch ��
		System.out.println(6);

	}

}
