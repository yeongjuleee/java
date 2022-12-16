package javaPractice.ch_18.java_util_package;

import java.io.FileInputStream;
import java.util.Scanner;

public class Example07 {
	// ���Ϸκ��� �Է¹��� ���α׷�
	// FileInputStream Ŭ������ ���� ������ ó���ϰ�, �̸� Scanner Ŭ������ ���� ���
	public static void main(String[] args) {
		try {
			FileInputStream fs = new FileInputStream(".//sample_file//sample.txt");
			Scanner scanner = new Scanner(fs);
			while (scanner.hasNext()) { // ���� �����ϸ� ����ؼ� �ݺ�
				System.out.println(scanner.nextLine());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
