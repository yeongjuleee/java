package javaPractice.ch_07;

class MyMath2 {
	long add (long a, long b) { // int �� long �ȿ� ���� long���� ����
	 return a + b; 	
	}
	int add (int[] a) { // �迭�� ��� ����� ���� ����� ������
		System.out.print("int add(int[] a) - ");
		int result = 0;
		for(int i = 0; i< a.length; i++) {
			result += a[i];	
			}
		return result;
	
	}
}

public class ClassInstanceMethodTest02 {

	public static void main(String[] args) {
		MyMath2 mm = new MyMath2();
		System.out.println("mm.add(3, 3) ���: " + mm.add(3, 3));
		
		System.out.println("mm.add(3L, 3) ���: " + mm.add(3L, 3));
		
		System.out.println("mm.add(3, 3L) ���: " + mm.add(3, 3L));
		
		System.out.println("mm.add(3L, 3L) ���: " + mm.add(3L, 3L));
		
		int[] a = {100, 200, 300};
		System.out.println("mm.add(a) ���: " + mm.add(a));

	}

}
