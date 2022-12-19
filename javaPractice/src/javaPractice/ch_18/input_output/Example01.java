package javaPractice.ch_18.input_output;

import java.io.IOException;

/*
* �ڹ� �����
�ڹٿ��� ��� ������� ��Ʈ�� stream�� ���� �̷����.
��Ʈ���̶� ��Ʈ��ũ���� ������ ����, �ڷ� �帧�� ���� �帧�� ���ٴ� �ǹ̿��� ���.
�ڷḦ �о� ���̷��� �ҽ� source�� �ڷḦ ������ ��� target�� ���� ���� �ٸ� ��Ʈ�� Ŭ������ ����.

* 1) �Է� ��Ʈ���� ��� ��Ʈ��
* �Է� ��Ʈ�� : � ������κ��� �ڷḦ �о� ���� �� ���.
* ��Ʈ���� �ܹ������� �ڷᰡ �̵��ϱ� ������ �Է°� ����� ���ÿ� �� �� ��� ������ ���� ��� ��Ʈ���� ���.

* ��Ʈ���� �̸��� ���� �Է¿����� ��¿����� �˼� ����.
* inputStrem�̳� Reader�� ������ �̸��� Ŭ������ �Է� ��Ʈ��
* ��) FileInputStream, FileReader, BufferedInputStream, BufferedReader ��
* OutputStream�̳� Writer�� ������ �̸��� Ŭ������ ��� ��Ʈ��
* ��) FileOutputStream, FileWriter, BufferedOutputStream, BufferedWriter ��
*
* 2) ����Ʈ ���� ��Ʈ���� ���� ���� ��Ʈ��
* ���� �ڹ��� ��Ʈ���� ����Ʈ byte ������ �ڷ��� ������� �̷����.
* ������ ������ ��� ���ڸ� ��Ÿ���� char���� 2����Ʈ�̱� ������ 1����Ʈ�� ������ �ѱ۰��� ���ڴ� ����.
* ���� ���� ���� ����ϴ� �ڷ��� ���ڸ� ���� ���� ��Ʈ���� ������ ����.
* �� �о� ���̴� �ڷ����� ���� ����Ʈ��� ���ڿ� ��Ʈ���� ����.
*
* ��Ʈ�� Ŭ������ �̸��� Stream���� ������ ���� ����Ʈ ������ ó���ϴ� ��Ʈ��
* Reader�� Writer�� ������ �̸��� ���ڸ� ���� ��Ʈ�� Ŭ����.
*
* ����Ʈ ��Ʈ�� : FileInputStream, FileOutputStream, BufferedInputStream, BufferedOutputStream ��
* ���� ��Ʈ�� : FileReader, FileWriter, BufferedReader, BufferedWriter ��

* 3) ��� ��Ʈ���� ���� ��Ʈ��
* ��� ��Ʈ�� : �ڷḦ ���� �аų� ���� ����� �����ϴ� ��Ʈ��.
* ���� ��Ʈ�� : �ڷḦ ���� �аų� ���� ����� ���� �ٸ� ��Ʈ���� �ΰ� ����� �����ϴ� ��Ʈ��.
* ���� �׻� �ٸ� ��Ʈ���� �����Ͽ� ����.

��� ��Ʈ���� ���� ��Ʈ���ΰ��� ���δ� �̸����� �Ǵ��� ��ư�, ���� ����ϴ� Ŭ���� ���ַ� ���.
��� ��Ʈ�� : FileInputStream, FileOutputStream, FileReader, FileWriter ��
���� ��Ʈ�� : InputStreamReader, OutputStreamReader, BufferedInputStream, , BufferedOutputStream ��

�� : FileInputStream�� ��� InputStream�̴� �Է� ��Ʈ���̰�, stream �̴� ����Ʈ ������ ó��,
File�� ���� �а� ���� ��� ��Ʈ��.
 */

public class Example01 {

	public static void main(String[] args) {
		/*
		 	ǥ�� ����� : ȭ�鿡 ����ϰ� �Է� �޴� ǥ�� ����� Ŭ����
		 	static PrintStream out : ǥ�� ��� ��Ʈ��
		 	static InputStream in : ǥ�� �Է� ��Ʈ��
		 	static OutputStream err : ǥ�� ���� ��� ��Ʈ��
		 */
		
		System.out.println("���ĺ� �ϳ��� ���� [Enter]�� ������");
		
		int i;
		try {
			// System.in : ǥ�� �Է� ��Ʈ��
			i = System.in.read();	// read() �޼ҵ�� �� ����Ʈ ����
			// System.out : ǥ�� �Է� ��Ʈ��
			System.out.println(i);	// int�� 4 ����Ʈ������, 1 ����Ʈ�� �о ���. �ƽ�Ű �ڵ带 ���
			System.out.println((char)i);
		}
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
