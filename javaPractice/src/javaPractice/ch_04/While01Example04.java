package javaPractice.ch_04;

public class While01Example04 {

	public static void main(String[] args) {
		// ��ø while�� ����Ͽ� ������ ����ϱ�
		
		int i = 2;
		while ( i <= 19) {
			System.out.println("***" + i + "�� ***");
			
			int j = 1;
			while(j <= 19) {
				System.out.println(i + " * " + j + " = " + i*j);
				j++;
			}
			System.out.println();
			i++;
		} // end of while(i <=19)

	}

}
