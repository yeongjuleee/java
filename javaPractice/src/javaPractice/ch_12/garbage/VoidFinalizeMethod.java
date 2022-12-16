package javaPractice.ch_12.garbage;

/*
void finalize()
new �����ڷ� ������ ��ü�� ���� ���� (���� ������ �����ؾ���.)
�޸𸮰� �������� �ʾ� �� ����� ��ü�� �����ؾ� ��
�ڹٿ��� ������ �÷��Ͱ� �ֱ������� �̻�� ��ü�� ã�� �޸𸮸� ȸ���ϱ� ������, ��ü�� �����ϴ� ������ ����� ����
�޸� ȸ���� �ڵ����� ����Ǽ� �޸� ������ ������ �ʿ䰡 ������ ��ü�� �����ؼ� ����ϱ⸸ �ϸ� ��

������ ������ �÷����� ����� �޸𸮿��� ���ѵǸ� �� �̿��� �ڿ��� ���۾����� ��ü�ؾ� ��
���� ��� ��Ʈ��ũ�� �����Ͽ� ����ϴ� Ŭ������� �����ϴ� ���۰� ������ ���� ������ �ʿ�
�Ʒ��� �ڵ忡�� disconnect() �޼ҵ� ȣ���� �����ų�, ���ܰ� �߻��� �޼ҵ尡 ȣ����� �ʾҴٸ�
��ü�� ������ �÷��Ϳ� ���� ȸ�������� ����� ����� �ƹ��� �������� �ʾ� ������ �� ���·� �����ְ� ��
*/

class Network {
	void connect() {
		System.out.println("���� �Ǿ����ϴ�.");
	}
	
	void disconnect() {
		System.out.println("������ ���������ϴ�.");
	}
}

public class VoidFinalizeMethod {
	static void communication() {
		Network network = new Network();
		network.connect();
		// ��Ʈ��ũ ���
		network.disconnect();		
	}
	
	public static void main(String[] args) {
		communication();

	}

}
