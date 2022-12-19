package javaPractice.ch_18.input_output;

import java.io.FileOutputStream;
import java.io.IOException;

/*
	OutputStream : ����Ʈ ������ ���� ��Ʈ�� �� �ֻ��� ��Ʈ��.
	�ڷ� ��� ��� ���� �ٸ� ��Ʈ���� ����.
		- FileOutputStream : ����Ʈ ������ ���Ͽ� �ڷḦ ��
		- ByteArrayOutputStream : Byte �迭�� ����Ʈ ������ �ڷḦ ��
		- FilterOutputStream : ��� ��Ʈ������ �ڷḦ �� �� �߰� ����� �����ϴ� ���� ��Ʈ���� ���� Ŭ����
	
	OutputStream���� �����ϴ� �޼ҵ�
		- void write(int b) : �� ����Ʈ�� ���
		- void write(byter[] b) : b[] �迭�� �ִ� �ڷḦ ���
		- void flush() : ����� ���� ��� �ڷᰡ �ӹ����� ��� ���۸� ������ ��� �ڷḦ ���
		- void close() : ��� ��ũ���� ����� ��� ���ҽ��� ����.
		  ��� ���۰� ����� (�� : FileOutputStream�� ��� ���� ����)
*/

public class Example06 {
	
	public static void main(String[] args) {
	/*
	    FileOutputStream : ���Ͽ� ����Ʈ ���� �ڷḦ ����ϱ� ���� ����ϴ� ��Ʈ��.
	
	    FileOutputStream(String name) : ���� �̸�(��� ����)�� �Ű������� �޾� ��� ��Ʈ���� ����.
	    FileOutputStream(String name, boolean append) : ���� �̸�(��� ����)�� �Ű������� �޾� ��� ��Ʈ���� ����.
	    append ���� true�̸� ���� ��Ʈ���� �ݰ� �ٽ� ������ �� ������ ������ �̾ ���. ����Ʈ ���� false.
	
	    FileOutputStream(File f) : File Ŭ���� ������ �Ű������� �޾� ��� ��Ʈ���� ����.
	    FileOutputStream(File f, boolean append) : File Ŭ���� ������ �Ű������� �޾� ��� ��Ʈ���� ����.
	    append ���� true�̸� ���� ��Ʈ���� �ݰ� �ٽ� ������ �� ������ ������ �̾ ���. ����Ʈ ���� false.
	
	    ������ �Ű������� ������ ������ ��ο� ������ FileOutputStream�� ������ ���� ����.
	    ���� ������ �ִ� ��� append ���� false�̸� ó�� ���� ���� ��. overwrite.
	    true�̸� ���� ���� �� �ڿ� �����ؼ� ��. append
	    */

    //FileOutputStream�� �����ϰ� write()�޼��带 Ȱ���Ͽ� ���Ͽ� ���� ���� ����
    // fos = new FileOutputStream("output.txt", true) ���� �ڷῡ �̾ ����� ���
	
	 try(FileOutputStream fos = new FileOutputStream("./sample_file/output.txt", true)) { // ����Ϸ��� ���� ���, true �ϸ� �پ �ѹ� �� ������.
		 // ���Ͽ� ���ڸ� ���� �ش��ϴ� �ƽ�Ű �ڵ� ������ ��ȯ
		 fos.write(65);
		 fos.write(66);
		 fos.write(67);
		 fos.write(68);
		 fos.write(69);
		 fos.write(70);
	 }
	 catch(IOException e) {
		 e.printStackTrace();
	 }
	 System.out.println("����� �Ϸ�Ǿ����ϴ�.");

	}
}