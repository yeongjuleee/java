package javaPractice.ch_12.garbage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;




/*
Class 클래스를 활용해 클래스 정보 알아보기
프로그래밍을 하다 보면 사용할 클래스의 자료형을 모르는 경우에 사용
Class 클래스를 가져올 수 있따면 해당 클래스의 정보, 즉 생성자/메소드/멤버 변수 정보를 찾을 수 있따

reflection(리플렉션) : 클래스의 자료형을 모르는 상태에서 Class 클래스를 활용하여 그 클래스의 정보를 가져오고, 이 정보를 
활용하여 인스턴스를 생성하거나 메소드를 호출하는 방식

예제에서 사용하는 Constructor, Method, Field 등의 클래스는 java.lang.reflect 패키지에 정의되어 있다
Class 클래스와 java.lang.reflect 패키지의 클래스를 사용하면 리플렉션 프로그래밍이 가능하다
*/

public class Class2 {

	public static void main(String[] args) throws ClassNotFoundException {
		// String 클래스 정보 가져오기
		
		Class strClass = Class.forName("java.lang.String");	// 클래스 이름으로 가져오기
		//Class strClass = Class.forName("javaPractice.ch_12.garbage.Person");	// 클래스 이름으로 가져오기
		
		
		Constructor[] constructors = strClass.getConstructors();	// 모든 생성자 가져오기
		System.out.println("* 모든 생성자 가져오기");
		for(Constructor c : constructors) {
			System.out.println(c);
		}
		
		System.out.println();
		System.out.println("* 모든 멤버 변수(필드) 가져오기");
		Field[] fields = strClass.getFields();	// 모든 멤버 변수(필드) 가져오기
		for(Field f : fields) {
			System.out.println(f);
		}
		
		System.out.println();
		System.out.println("* 모든 메소드 가져오기");
		Method[] methods = strClass.getMethods();	// 모든 메소드 가져오기
		for (Method m : methods) {
			System.out.println(m);
		}
	}

}
