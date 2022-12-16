package javaPractice.ch_09.abstractClass_innerclass;

/*
익명 anonymous 객체
이름이 없는 객체 
익명 객체를 만드는 조건은 어떤 클래스를 상속하거나 인터페이스를 구현해야 함
자식 클래스를 재사용하지 않고, 오로지 특정 위치에서 사용할 경우라면 자식 클래스를 명시적으로 선언하는 것이 귀찮은 작업이 됨
이 경우 '익명 자식 객체'를 생성해서 사용하는 방법을 사용
일반적으로 재정의 메소드가 많이 나오는데, 일반 클래스와의 차이점은 생성자를 선언할 수 X
*/

class Person {
	void wake() {
		System.out.println("7시에 일어납니다.");
	}
}

class Anonymous {
	// 필드 초기값으로 대입.
	// 필드 값으로 익명 객체 대입
	Person field = new Person() { 
		// 참조변수 = 부모클래스 => 참조 변수 field 의 부모 클래스 Person
		void work() {
			System.out.println("출근 합니다.");
		}

		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}
		
		
		
	};
	
	void method1() {
		// 로컬 변수값으로 대입. 로컬 변수값으로 익명 객체 대입
		Person localVar = new Person() {
			// localVar 안에도 Person이라는 부모 객체가 가지고 있는 메소드를 상속
			void walk() {
				System.out.println("산책 합니다.");
			}

			@Override
			void wake() {
				System.out.println("7시에 일어납니다.");
				walk();
			}
			
		};
		// 로컬 변수 사용
		localVar.wake();
	}
	void method2 (Person person) {
		person.wake();
	}
}

public class AnonymousClass03 {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		// 익명 객체 필드 사용
		anony.field.wake();
		// 익명 객체 로컬 변수 사용
		anony.method1();
		// 익명 객체 매개값 사용
		anony.method2(
				// 메소드2 호출 외에는 쓸 일 X 
				// 매개값으로 익명 객체 대입
				new Person() {
					// Person은 상속받은 부모객체이거나 ..?
					void study() {
						System.out.println("공부 합니다.");
					}

					@Override
					void wake() {
						System.out.println("8시에 일어납니다.");
						study();
					}
					
				}
				
			);

	}
	
}
