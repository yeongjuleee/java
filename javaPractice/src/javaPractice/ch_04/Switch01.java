package javaPractice.ch_04;

public class Switch01 {

	public static void main(String[] args) {
		// Switch �� : �ϳ��� ���ǽ����� ���� ����� ���� ó���ϴ� ���ǹ�
		// �ϳ� ���� ���� å ���� ���� ��Ʈ ����ϱ�
		
		int book = 15;
		book = book / 10;
		
		switch(book) {
		case 0: // 10�� �̸�
			System.out.println("���� �� ��� �ϼ���!");
			break;
		
		case 1: // 10�� �̻� 20�� �̸�
			System.out.println("å �д� ���� ���ô� ���̽ó׿�!");
			break;
		
		case 2: // 20�� �̻� 30�� �̸�
			System.out.println("å�� ����ϴ� ���̽ó׿�!");
			break;
			
		default: // 30�� �̻�
			System.out.println("����� �ٵ����Դϴ�!");
		}
		
		// �޴޿� ���� ��Ʈ ����ϱ�
		
		String medal = "Silver";
		// medal �� Silver �� �� �ش�Ǵ� case�� ���� ����.
		
		switch(medal) {
		case "Gold":
			System.out.println("�ݸ޴� �Դϴ�.");
			break;
			
		case "Silver":
			System.out.println("���޴� �Դϴ�.");
			break;
			
		case "Bronze":
			System.out.println("���޴� �Դϴ�.");
			break;
			
		default:
			System.out.println("�޴��� �����ϴ�.");
			break;
		}

	}

}
