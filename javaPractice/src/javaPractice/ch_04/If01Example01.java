package javaPractice.ch_04;

public class If01Example01 {

	public static void main(String[] args) {
		// If ���ǹ��� ���׿����ڷ� �ٲ� ����ϱ�
		// ���׿����� (���ǽ�?�׸�1:�׸�2)�� ���Ǹ���� �غ���.
		
		int age = 15;
		String a = "�����Դϴ�. \n���ο���� ����˴ϴ�.";
		String b = "û�ҳ��Դϴ� \nû�ҳ� ����� ����˴ϴ�.";
		
		System.out.println( age > 19? a:b  );
		System.out.println("������ ������ �ּ���.");
		
		// ������� ��: 
		// System.out.println(age > 19 ? "�����Դϴ�. \n���ο���� ����˴ϴ�." : "û�ҳ��Դϴ�. \nû�ҳ� ����� ����˴ϴ�.");
		// System.out.println("������ ������ �ּ���.");
	}

}
