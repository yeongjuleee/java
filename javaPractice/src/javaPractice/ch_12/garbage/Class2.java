package javaPractice.ch_12.garbage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;




/*
Class Ŭ������ Ȱ���� Ŭ���� ���� �˾ƺ���
���α׷����� �ϴ� ���� ����� Ŭ������ �ڷ����� �𸣴� ��쿡 ���
Class Ŭ������ ������ �� �ֵ��� �ش� Ŭ������ ����, �� ������/�޼ҵ�/��� ���� ������ ã�� �� �ֵ�

reflection(���÷���) : Ŭ������ �ڷ����� �𸣴� ���¿��� Class Ŭ������ Ȱ���Ͽ� �� Ŭ������ ������ ��������, �� ������ 
Ȱ���Ͽ� �ν��Ͻ��� �����ϰų� �޼ҵ带 ȣ���ϴ� ���

�������� ����ϴ� Constructor, Method, Field ���� Ŭ������ java.lang.reflect ��Ű���� ���ǵǾ� �ִ�
Class Ŭ������ java.lang.reflect ��Ű���� Ŭ������ ����ϸ� ���÷��� ���α׷����� �����ϴ�
*/

public class Class2 {

	public static void main(String[] args) throws ClassNotFoundException {
		// String Ŭ���� ���� ��������
		
		Class strClass = Class.forName("java.lang.String");	// Ŭ���� �̸����� ��������
		//Class strClass = Class.forName("javaPractice.ch_12.garbage.Person");	// Ŭ���� �̸����� ��������
		
		
		Constructor[] constructors = strClass.getConstructors();	// ��� ������ ��������
		System.out.println("* ��� ������ ��������");
		for(Constructor c : constructors) {
			System.out.println(c);
		}
		
		System.out.println();
		System.out.println("* ��� ��� ����(�ʵ�) ��������");
		Field[] fields = strClass.getFields();	// ��� ��� ����(�ʵ�) ��������
		for(Field f : fields) {
			System.out.println(f);
		}
		
		System.out.println();
		System.out.println("* ��� �޼ҵ� ��������");
		Method[] methods = strClass.getMethods();	// ��� �޼ҵ� ��������
		for (Method m : methods) {
			System.out.println(m);
		}
	}

}
