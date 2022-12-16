package javaPractice.ch_09.abstractClass.Interface;

interface Camera {
	void photo();
}

interface Call {
	void calling();
}

interface Memo {
	void write();
}

interface Clock {
	void clock();
}

class MyCellPhone implements Camera, Call, Memo, Clock {

	@Override
	public void clock() {
		// �ð� �޼ҵ�
		
	}

	@Override
	public void write() {
		// �޸� �޼ҵ�
		
	}

	@Override
	public void calling() {
		// ��ȭ �޼ҵ�
		
	}

	@Override
	public void photo() {
		// ���� �޼ҵ�
		
	}
	
}

class PhoneUser {
	void call(Call c) {
		System.out.println("��ȭ�� �ɾ����ϴ�.");
	}
}

public class Interface03 {

	public static void main(String[] args) {
		MyCellPhone phone1 = new MyCellPhone();
		Camera phone2	   = new MyCellPhone();
		Call phone3		   = new MyCellPhone();
		Memo phone4		   = new MyCellPhone();
		Clock phone5	   = new MyCellPhone();
		
		PhoneUser user1	   = new PhoneUser();
		user1.call(phone3);
		user1.call(phone1);
		user1.call((MyCellPhone)phone2);

	}

}
