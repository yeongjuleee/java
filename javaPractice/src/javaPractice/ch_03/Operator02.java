package javaPractice.ch_03;

public class Operator02 {

	public static void main(String[] args) {
		// �� ������ 
		// ������ ���ؼ� ������ �������� Ȯ���ϴ� ���� ����
		//��� ���� true or false.
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println(a < b); // true
		System.out.println(a > b); // false
		System.out.println(a + b <= c); // true
		System.out.println(a + b >= c); // true
		
		// �� �����ڿ��� ���ڿ��� ��� 
		// equals() �޼ҵ带 �̿��Ͽ� ���� ��.
		
		String c1 = "Hello JAVA!";  // ���⼭ c1�� ��ü��. (�����ƴѵ� �ϴ� ������� ����.)
		
		System.out.println(c1.equals("Hello java!")); // false
		System.out.println(c1.equals("Hello JAVA!")); // true
		
		// == �� ��ü�� �ּҰ��� ����. (c1 �̶�� ��ü�� ���� ���ڿ��� �� �ϴ� ���� �ƴ�. ���� class ���� �� ����.)
		System.out.println(c1 == "Hello java!"); // false
		System.out.println(c1 == "Hello JAVA!"); //true
		

	}

}
