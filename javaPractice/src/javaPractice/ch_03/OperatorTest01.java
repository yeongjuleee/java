package javaPractice.ch_03;

public class OperatorTest01 {

	public static void main(String[] args) {
		// ���� ������ �����ϱ� 1.
		
		int i = 5, j = 5;
		System.out.println(i++);  // i �� 5 ��� �Ŀ� ������.
		
		System.out.println(++j); // j�� ������ �� ��� => 6
		
		System.out.println("i =" + i + ", j =" + j);  // i�� 5�� ��µ� �� ++ �Ǿ� 6�� �Ǿ�����. �׷��� i �� j�� ���� ��������.
		
		
		// ���� ������ �����ϱ� 2. (���������� �����Ǿ� ���� �� �� �����غ���)
		
		int x = 5;
		int y = 0;
		y = x++; // y�� x ���� �����ϰ� �� �Ŀ� ++ �� �Ͼ. ���� x �� 6, y �� 5.
		System.out.println("y = x++; ���� ��, x=" + x + ", y="+ y); // y= x++ ������, x= 6 , y= 5
		
		//����� ���ϱ� ���� x�� y ���� �ٽ� 5�� 0���� ����
		x = 5;
		y = 0;
		y = ++x;
		System.out.println("y= ++x; ���� ��, x="+ x +", y="+ y); // y= ++x; ���� ��, x= 6, y= 6
	}

}
