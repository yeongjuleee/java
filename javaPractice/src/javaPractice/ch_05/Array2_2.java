package javaPractice.ch_05;

public class Array2_2 {

	public static void main(String[] args) {
		// 5�� �л��� ����, ����, ���� ���� �����͸� ������
		// 1. �� �л��� 3���� ������ ���
		// 2. �� ������ ��� �л��� ������ ���ϱ�.
		
		int[][] score = {
				// { ��, ��, ��}
				{ 100, 100, 100 }, // 1��
				{ 20, 20, 20 }, // 2��
				{ 30, 30, 30 }, // 3��
				{ 40, 40, 40 }, // 4��
				{ 50, 50, 50 } //5��
		};
		int koreanTotal = 0;
		int englishTotal = 0;
		int mathTotal = 0;
		
		System.out.println("��ȣ\t����\t����\t����\t����\t���");
		System.out.println("===============================================");
		
		//System.out.println(score.length); // �� 5��
		for (int i=0; i < score.length; i++) { // �� �ݺ�.  �� ���� ���� ����.
			int sum = 0; // ���� ���� ���� 
			koreanTotal += score[i][0];
			englishTotal += score[i][1];
			mathTotal += score[i][2];
			
			System.out.print(" " + (i + 1) + "\t"); // ��ȣ. �� ���� �ε�����ȣ�� 1�� ����. ��ȣ ������ 1���� �ϱ� ����
			
			//System.out.println(score[i].length); // �� 3��
			for (int j=0; j < score[i].length; j++) {
				// �� �࿡���� ���� �ݺ�.  �� ���� ���� ����. 
				sum += score[i][j]; // ������ ���� �� ��� ��
				System.out.print(score[i][j] + "\t"); // �� �࿡ ���� ���� ���� ����. ��,��,�� 
			}
			System.out.println(sum + "\t" + sum/(double)score[i].length); // �� ���� ���� ����� ����.
		}
		
		System.out.println("===============================================");
		System.out.println("����:\t" + koreanTotal + "\t" + englishTotal + "\t" + mathTotal);
		

	}

}
