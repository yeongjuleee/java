package javaPractice.ch_18.input_output;

import java.io.FileReader;
import java.io.IOException;

/*
	���� ���� ��Ʈ��
	Reader : ���� ������ �д� ��Ʈ�� �� �ֻ��� ��Ʈ��
	
	Reader ���� ��Ʈ��.
	FileReader : ���Ͽ��� ���� ������ ���� ��Ʈ�� Ŭ����
	InputStreamReader : ����Ʈ ������ ���� �ڷḦ ���ڷ� ��ȯ�� �ִ� ���� ��Ʈ��
	BufferedReader : ���ڷ� ���� �� �迭�� �����Ͽ� �Ѳ����� ���� �� �ִ� ����� ������ �ִ� ���� ��Ʈ��
	
	Reader ���� �޼���
	int read() : ���Ϸ� ���� �� ���ڸ� ����. ���� ���� ��ȯ.
	int read(char[] buf) : ���Ϸ� ���� buf �迭�� ���ڸ� ����.
	int read(char[] buf, int off, int len) : ���Ϸ� ���� buf. �迭�� off ��ġ�������� len ���� ��ŭ ���ڸ� ����.
	void close() : ��Ʈ���� ����� ���� ���ҽ��� ����.
*/

public class Example08 {

	public static void main(String[] args) {
		/*
			 FileReader
			 FileReader(String name) : ���� �̸� name(��� ����)�� �Ű������� �޾� �Է� ��Ʈ���� ����
			 FileReader(File f) : File Ŭ���� ������ �Ű������� �޾� �Է� ��Ʈ���� ����
			 
			 ���� ��Ʈ�� FileReader�� ������ �ѱ��� ����� ����
 		*/
		try(FileReader fr = new FileReader("./sample_file/reader.txt")) {
			int i;
			while((i = fr.read()) != -1) {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
