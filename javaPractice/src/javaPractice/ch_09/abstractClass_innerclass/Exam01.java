package javaPractice.ch_09.abstractClass_innerclass;
// ���� Ŭ����
// ������ �۾�, �ȵ���̵� �۾��� �� �� ���� �����.
class A {
	class InstanceInner{}	// ���� Ŭ����
	
	static class Staticlnner{}	// static ���� Ŭ����. ����ƽ ������� ���� ����
	
	Staticlnner st1 = new Staticlnner();
	
	static void StaticMethod() {
		// ����ƽ ����� ����ƽ ���� Ŭ������ ���� ����
		Staticlnner st2 = new Staticlnner();
		
		// ����ƽ ����� �ν��Ͻ� ����� ���� �Ұ�
		// InstanceInner ii2 = new InstanceInner(); => ���� �߻�
		
	}
	
	void instanceMethod() {
		// �ν��Ͻ� ����� ��� ���� ����
		Staticlnner st3 = new Staticlnner();
		InstanceInner ii3 = new InstanceInner();
	}
}

public class Exam01 {


}
