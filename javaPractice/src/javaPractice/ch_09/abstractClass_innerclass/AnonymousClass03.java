package javaPractice.ch_09.abstractClass_innerclass;

/*
�͸� anonymous ��ü
�̸��� ���� ��ü 
�͸� ��ü�� ����� ������ � Ŭ������ ����ϰų� �������̽��� �����ؾ� ��
�ڽ� Ŭ������ �������� �ʰ�, ������ Ư�� ��ġ���� ����� ����� �ڽ� Ŭ������ ��������� �����ϴ� ���� ������ �۾��� ��
�� ��� '�͸� �ڽ� ��ü'�� �����ؼ� ����ϴ� ����� ���
�Ϲ������� ������ �޼ҵ尡 ���� �����µ�, �Ϲ� Ŭ�������� �������� �����ڸ� ������ �� X
*/

class Person {
	void wake() {
		System.out.println("7�ÿ� �Ͼ�ϴ�.");
	}
}

class Anonymous {
	// �ʵ� �ʱⰪ���� ����.
	// �ʵ� ������ �͸� ��ü ����
	Person field = new Person() { 
		// �������� = �θ�Ŭ���� => ���� ���� field �� �θ� Ŭ���� Person
		void work() {
			System.out.println("��� �մϴ�.");
		}

		@Override
		void wake() {
			System.out.println("6�ÿ� �Ͼ�ϴ�.");
			work();
		}
		
		
		
	};
	
	void method1() {
		// ���� ���������� ����. ���� ���������� �͸� ��ü ����
		Person localVar = new Person() {
			// localVar �ȿ��� Person�̶�� �θ� ��ü�� ������ �ִ� �޼ҵ带 ���
			void walk() {
				System.out.println("��å �մϴ�.");
			}

			@Override
			void wake() {
				System.out.println("7�ÿ� �Ͼ�ϴ�.");
				walk();
			}
			
		};
		// ���� ���� ���
		localVar.wake();
	}
	void method2 (Person person) {
		person.wake();
	}
}

public class AnonymousClass03 {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		// �͸� ��ü �ʵ� ���
		anony.field.wake();
		// �͸� ��ü ���� ���� ���
		anony.method1();
		// �͸� ��ü �Ű��� ���
		anony.method2(
				// �޼ҵ�2 ȣ�� �ܿ��� �� �� X 
				// �Ű������� �͸� ��ü ����
				new Person() {
					// Person�� ��ӹ��� �θ�ü�̰ų� ..?
					void study() {
						System.out.println("���� �մϴ�.");
					}

					@Override
					void wake() {
						System.out.println("8�ÿ� �Ͼ�ϴ�.");
						study();
					}
					
				}
				
			);

	}
	
}
