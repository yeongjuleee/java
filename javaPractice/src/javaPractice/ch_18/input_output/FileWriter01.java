package javaPractice.ch_18.input_output;

import java.io.FileWriter;
import java.io.IOException;

/*
	Writer
	���� ������ ����ϴ� ��Ʈ�� �� �ֻ��� ��Ʈ��.
	
	Writer ���� Ŭ����
	FileWriter : ���Ͽ� ���� ������ ����ϴ� ��Ʈ�� Ŭ����
	OutputStreamWriter : ���Ͽ� ����Ʈ ������ ����� �ڷḦ ���ڷ� ��ȯ�� �ִ� ���� ��Ʈ��.
	BufferedWriter : ���ڷ� �� �� �迭�� �����Ͽ� �Ѳ����� �� �� �ִ� ����� ������ �ִ� ���� ��Ʈ��.
	
	Writer ���� �޼���
	void write(int c) : �� ���ڸ� ���Ͽ� ���
	void write(char[] buf) : ���� �迭 buf�� ������ ���Ͽ� ���
	void write(char[] buf, int off, int len) : ���� �迭 buf�� off��ġ���� len ������ ���ڸ� ���Ͽ� ���.
	void write(string str) : ���ڿ� str�� ���Ͽ� ���
	void write(string str, int off, int len) : ���ڿ� str�� off��° ���ں��� len ���� ��ŭ ���Ͽ� ���.
	void flush() : ����� ���� ��� �ڷᰡ �ӹ����� ��� ���۸� ������ ��� �ڷḦ ��� 
	void close() : ��� ��ũ���� ����� ��� ���ҽ��� ����. ��� ���۵� �����.
*/

public class FileWriter01 {

	public static void main(String[] args) {
		/*
			 FileWriter
			 �����ڸ� ����ؼ� ��Ʈ���� ����
			 
			 FileWriter(Stirng name) : ���� �̸�(��� ����)�� �Ű������� �޾� ��� ��Ʈ���� ����
			 FileWriter(String name, boolean append) : ���� �̸�(��� ����)�� �Ű������� �޾� ��� ��Ʈ���� ����
			 append ���� true �̸�, ���� ��Ʈ���� �ݰ� �ٽ� ������ �� ������ ������ �̾ ���. ����Ʈ ���� false'
			 
			FileWriter(file f) : File Ŭ���� ������ �Ű������� �޾� ��� ��Ʈ�� ����
			FileWriter(String name, boolean append) : File Ŭ���� ������ �Ű������� �޾� ��� ��Ʈ���� ����
			append ���� true�̸� ���� ��Ʈ���� �ݰ�, �ٽ� ������ �� ������ ������ �̾ ���. ����Ʈ ���� false 
		*/
		
		try(FileWriter fw = new FileWriter("./output_file/writer.txt")) {
			fw.write('A'); 	// ���� �ϳ� ���
			char[] buf = {'B', 'C', 'D', 'E', 'F', 'G'};
			
			fw.write(buf);	// ���� �迭 ���
			fw.write("�رԾ�, ������ �ϰ� ����?");	// String ���
			fw.write(buf, 1, 2);	// ���� �迭�� �Ϻ� ���
			fw.write("65");	// ���ڸ� �״�� ���
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("����� �Ϸ�Ǿ����ϴ�.");

	}

}
