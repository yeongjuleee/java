package javaPractice.ch_07;


public class Class03 {
	//���� Ŭ������ ������ ���� �� ��ü�� ������ ���������� ���� �ٸ� ���� ������ ����

	public static void main(String[] args) {
		Car1 mycar1 = new Car1(); // car �ν��Ͻ� ����
		Car1 mycar2 = new Car1(); // car �ν��Ͻ� �ϳ� �� ����
		
		// �Ӽ� ����
		mycar1.color = "white"; // mycar1 �� ���� white
		mycar2.color = "black"; // mycar2 �� ���� black
		mycar1.speedUp(); // mycar1 ���� �޼ҵ� ȣ��
		mycar2.wiper(); // mycar2 ������ �޼ҵ� ȣ��
		
		//�޼ҵ� ����
		System.out.println("mycar1�� �� : " + mycar1.color);
		System.out.println("mycar2�� �� : " + mycar2.color);
		System.out.println("mycar1�� �ӵ� : " + mycar1.speed);
		System.out.println("mycar2�� �ӵ� : " + mycar2.speed);
		System.out.println("mycar1�� ������ �۵� ���� : " + mycar1.wiperOn);
		System.out.println("mycar2�� ������ �۵� ���� : " + mycar2.wiperOn);

	}

}
