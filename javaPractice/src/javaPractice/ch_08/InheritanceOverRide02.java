package javaPractice.ch_08;

class MyParent {
	public void pDispaly() {
		System.out.println("Super Class: Parent's Display");
	}
}

class MyChild extends MyParent {

	
	// ���� Ŭ������ �޼ҵ带 ������
	@Override
	public void pDispaly() { 
		// ���е� ���� Ŭ������ �޼ҵ带 super�� ȣ��
		super.pDispaly();
		System.out.println("Sub Class: Parent's Display");
	}
	public void cDisplay() {
		System.out.println("Sub Class: Child's Display");
	}
	
	
}

public class InheritanceOverRide02 {

	public static void main(String[] args) {
		MyChild c = new MyChild();
		c.pDispaly(); // �����ǵ� ���� Ŭ������ �޼ҵ带 ȣ��
		// Super: Parent's Display
		// Sub Class: Parent's Display

	}

}
