package javaPractice.ch_06;

public class Method11 {

	// �޼ҵ� ������ �޼ҵ� ȣ��
	// �޼ҵ忡�� �ٸ� �޼ҵ带 ȣ���ϸ� �޼ҵ�� ������ ���߰�, �ٸ� �޼ҵ尡 ����� ������ ��ٸ�
	// ȣ���� �޼ҵ尡 ���ᰡ �Ǹ� ������ �ڵ� ����.
	
	//�������
	// main() => firstMethod() => secondMethod()
	
	// main method���� firstmethod�� ȣ�� => main method ��� => firstmethod������ �̵� => firstmethod���� secondmethod ȣ�� 
	// => firstmethod ��� => secondmethod ���� => secondmethod ���� => firstmethod ����  => firstmethod ���� => main method ����
	// => mainmethod ����
	
	public static void main(String[] args) {
		System.out.println("main(String[] args)�� ���۵Ǿ���");
		firstMethod();
		System.out.println("main(String[] args)�� ������");

	}
	
	static void firstMethod() {
		System.out.println("firstMethod()�� ���۵Ǿ���");
		secondMethod();
		System.out.println("firstMethod()�� ������");
	}
	
	static void secondMethod() {
		System.out.println("secondMethod()��  ���۵Ǿ���");
		System.out.println("secondMethod()�� ������");
	}

}
