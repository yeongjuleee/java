package javaPractice.ch_09.abstractClass;

/*
개발 관리자가 Student2 상위 클래스를 만들면서 학생의 담당 선생이나 교수를 구하는 메소드.
getTeacher()를 만들었고, 각 개발자에게 오버라이딩을 하라고 시킴.
하지만 기존 개발자가 교체되어 해당 프로젝트에 익숙하지 않은 경우, 
관리자의 지시를 잘못 이해해서 Elementary, Universit 클래스 제작시에 
기능은 유사하지만 이름이 다른 메소드를 만들게 됨.

이후 다른 다른 개발자들이 만든 Student 를 상속한 클래스와 통일성을 잃어버리게 됨
현재 프로그래밍 경향은 개발자가 각 기능을 알아서 구현하는 것 보다 
프로젝트의 규모가 점점 커지므로 "향후 유지보수나 관리를 위해서" 
1. 누구나 쉽게 소스를 이행하고
2. 소스의 구조를 일정하게 유지해야 할 필요성이 있음

하지만 이런 방식으로 오버라이딩을 구현하면 개발자가 임의로 소스를 구현할 수 있기 때문에 통일성을 읽을 수 있음

단순 프로그램의 개발보다 개발 생산성이 높고, 유지 보수가 쉬우며, 기능의 변경이나 확장이 용이한 
방식으로 개발

해당 소스를 추상 클래스를 도입해 오버라이딩에 강제성을 부여할 것
객체 생성시 담당 교수나 선생을 입력하는 생성자를 추가할 것
*/


public class AbstractMethod05 {

	public static void main(String[] args) {
		
		/*
		해당 소스를 추상 클래스를 도입해 오버라이딩에 강제성을 부여할 것
		객체 생성시 담당 교수나 선생을 입력하는 생성자를 추가할 것
		*/
		
		University university = new University("박지훈", 2, 24, "윤재혁");
		Elementary elementary = new Elementary("김준규", 3, "박정우");
		
		Student2[] students = new Student2[2];
		students[0] = university;
		students[1] = elementary;
		
		for (Student2 s : students) {
			System.out.println("학생 이름: " + s.getName());
			System.out.println(s.getTeacher());
		}
		
		/*
		학생 이름 : 박지훈
		담당 교수님 : 윤재혁
		학생 이름 : 김준규
		담당 선생님 : 박정우
		*/
		
	}

}
