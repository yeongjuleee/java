package javaPractice.ch_15.design_patton.mvc.shcool;

import java.util.ArrayList;
import java.util.Scanner;

//����!
//1. StudentManage Ŭ������ �ʵ�, �޼ҵ带 static ������� �ʵ��� �����ϱ�
//	1) View������ ��ü ���� �� ����
//	2) private ���
//2. �л� ���� ��ȸ �޴����� ������ �ߺ� �Ǵ� �κ��� �޼ҵ�� ����
//3. Manage�� className �迭�� ������ �߰��ϰų� �����ϸ� 
//���� ��ȣ ��µǴ� �κа� ���� ��û, ���� �κ��� ���� �ǵ��� �ϱ�.

public class StudentManage_02 {
		// �ʵ�
		private Scanner input = new Scanner(System.in);
		private ArrayList<Student> students = new ArrayList<>();
		// �迭�� ������ �߰� �ϰų� �����ϸ� ���� ��ȣ ��� �Ǵ� �κа� ���� ��û/ ���� �κ��� �����ǵ���
//		static String[] className = {"JAVA", "PYTHON", "C", "JS"};
		private ArrayList<String> className = new ArrayList<>();
		
		public StudentManage_02() { // ���� ������
			className.add(0, "JAVA");
			className.add(1, "PYTHON");
			className.add(2, "C");
			className.add(3, "HTML + CSS + JS");
		}
	

		public Student findStudentInform(int studentNumber) {
			for (Student student : students) {
				if (student.getStudentNumber() == studentNumber) {
					System.out.println("�ش� �л��� ������ ������ �����ϴ�.");
					System.out.println("�̸�: " + student.getName());
					System.out.println("��ȭ��ȣ: " + student.getPhoneNumber());
					System.out.println("�޸�: " + student.getMemo());
					return student;
				}
			} return null;
		}
		
		// Getter Setter
		public Scanner getInput() {
			return input;
		}




		public void setInput(Scanner input) {
			this.input = input;
		}




		public ArrayList<Student> getStudents() {
			return students;
		}




		public void setStudents(ArrayList<Student> students) {
			this.students = students;
		}

		public ArrayList<String> getClassName() {
			return className;
		}
		
		public void setClassName(ArrayList<String> className) {
			this.className = className;
		}


//		public String[] getClassName() {
//			return className;
//		}
//
//
//
//
//		public void setClassName(String[] className) {
//			this.className = className;
//		}

		
		
		
		// �޼ҵ�
		@Override
		public String toString() {
			return "1. " + className.get(0) + " 2. " + className.get(1) + " 3. " + className.get(2) + " 4. " + className.get(3);
		}
		
		
		public int stdNum() { // �л� ��ȣ �Է��ϱ�
			System.out.print("�л��� �й��� �Է��ϼ��� >> ");
			int studentNumber = input.nextInt();
			return studentNumber;
		}
		


		// 1. �л� �߰� �� ���� 
		public void addStudent() { 
//			System.out.println("�л��� �й��� �Է��ϼ��� >> ");
//			int studentNumber = input.nextInt();	// �й� �Է� �ޱ�
			
			int studentNumber = stdNum();
			
			// �Է��� �й����� ���ο� �л��� �����ϱ�
			Student newStudent = findStudentInform(studentNumber);
			if (newStudent == null) { // ���ο� �л��� null �̸� �й����� �Է��ϰ� ����
				newStudent = new Student(studentNumber);
				students.add(newStudent);	// �л� ��ü�� ArrayList�� ����
			}
			
			// �����ϱ�
			System.out.print("�̸��� �Է��ϼ��� >> ");
			newStudent.setName(input.next());	// ���ڿ� �Է� �޾� setName�� ����
			System.out.print("��ȭ��ȣ�� �Է��ϼ��� >> ");
			newStudent.setPhoneNumber(input.next());
			System.out.print("�޸� �Է��ϼ��� >> ");
			newStudent.setMemo(input.next());
			
			System.out.println("�л� �߰� �� ������ �Ϸ�Ǿ����ϴ�." + "\n");
		}
		
		// 2. �л� ���� 
		public void removeStudent() { 
//			System.out.print("�л��� �й��� �Է��ϼ��� >>> ");
//			int studentNumber = input.nextInt();	// �й��� �Է� ����
			int studentNumber = stdNum();
			
			Student newStudent = findStudentInform(studentNumber);
			if(newStudent == null) { // ���� ���� �л��� ������ ���ٸ�,
				System.out.print("Error: �л��� �������� �ʽ��ϴ�!!");
				return;	// �޼ҵ� ����
			}

			
			students.remove(newStudent);	// �ش� �л� ����
			System.out.println("�л� ������ �Ϸ� �Ǿ����ϴ�.");
		}
		
		
		// 3. ���� ��û
		public void addClass() { 
//			System.out.print("�л��� �й��� �Է��ϼ��� >>> ");
//			int studentNumber = input.nextInt();	// �й��� �Է� ����
			int studentNumber = stdNum();
			
			Student newStudent = findStudentInform(studentNumber);
			if(newStudent == null) { // ���� ���� �л� ������ ���ٸ�,
				System.out.println("Error: �л��� �������� �ʽ��ϴ�!!");
				return;	// �޼ҵ� ����
			}
			
			while(true) { // �޴� �ȿ� �޴�
				System.out.println("�޴��� �����ϼ���: 1. ������û / 2. �������� / 3. ����");
				int classMenu = input.nextInt();
				switch(classMenu) {
					case 1 :
						setClass("���� ��û �� ������ �����ϼ���.", newStudent, true);
						// ������û�� ��� false -> true�� 
						break;
					
					case 2 : 
						setClass("���� ������ ������ �����ϼ���.", newStudent, false);
						// ���� ���� �� ��� false -> false �Ǵ� true -> false
						break;
						
					case 3 :
						return;
				}
			}
		}
		
		public void setClass(String message, Student newStudent, boolean check) {
			System.out.println(message);
			//System.out.println(/*className �������� */);
			for (int i = 0; i < className.size(); i++) { // ����� ������ŭ ���� �ݺ�
				String study = className.get(i);
				System.out.println((i+1) + " : " + study);
			}
//			for(int i = 0; i < className.length; i++) {
//				String study = className[i];
//				System.out.println((i+1) + " : " + study);
//			}
			
			
			int index = input.nextInt() - 1; // �Է��� ���� -1 �� �ϸ� index���� ��
			newStudent.setClassCheck(index, check);
			
			if(!check) { // ���� ������ �����̶��,
				newStudent.setClassScore(index, 0);	// ������ 0���� �ǵ���
			}
		}
		
		// 4. ���� �Է�
		public void setScore() { 
//			System.out.print("�л��� �й��� �Է��ϼ��� >>> ");
//			int studentNumber = input.nextInt();	// �й��� �Է� ����
			int studentNumber = stdNum();
			
			Student newStudent = findStudentInform(studentNumber);
			if(newStudent == null) { // ���� ���� �л� ������ ���ٸ�,
				System.out.println("Error: �л��� �������� �ʽ��ϴ�.");
				return;	// �޼ҵ� ����
			}
			
			while(true) { // ������ �Է��ϱ� ���� ������ ���� ����.
				//System.out.println("������ �Է�/���� �� ������ �����ϼ���. 1. JAVA / 2. PYTHON / 3. C / 4. ����");
				System.out.println("������ �Է�/���� �� ������ �����ϼ��� " + toString() + " / 5. ����");
				int classMenu = input.nextInt();
				if(classMenu == 5) { // ���� üũ
					break; // while�� ����
				}
				
				if(!newStudent.getClassCheck() [classMenu-1]) { // �̽�û üũ
					System.out.println(className.get(classMenu-1)+ "������ �̽�û �����Դϴ�!");
					continue;	// �̽�û ������ ó������ ���ư���.
				}
				
				System.out.print("������ �Է��ϼ���. >>> ");
				int score = input.nextInt();
				if(score < 0 || score > 100) { // ������ 0 ~ 100 �������� Ȯ��
					System.out.println("Error: ������ 0���� 100 ������ ���ڸ� �Է��� �ּ���!");
					continue;	// ó������ ���ư�
				}
				// �������� ����� ������ �Էµ� ���
				newStudent.setClassScore(classMenu-1, score);	// �ش� �л��� Score�� ������Ʈ �Ѵ�
				System.out.println(className.get(classMenu-1) + "���� �Է��� �Ϸ�Ǿ����ϴ�.");	// ���
			}
		}
		
		
		// 5. ���� ��ȸ
		public void informStudent() { 
			System.out.println("�޴��� ������ �ּ��� 1. Ư�� �л��� / 2. ��ü �л�");
			int menu = input.nextInt();
			switch(menu) {
				case 1 : // Ư�� �л��� ���� ����
					One();
					break;
					
				case 2 : // ��ü �л��� ���� ����
					All();
					break;
			}
		}
		
		private void One() {
//			System.out.print("�л��� �й��� �Է��ϼ��� >>> ");
//			int studentNumber = input.nextInt();
			int studentNumber = stdNum();
			
			Student newStudent = findStudentInform(studentNumber);
			if(newStudent == null ) { // ���� ���� �л��� ������ ���ٸ�,
				System.out.println("Error: �л��� �������� �ʽ��ϴ�!!");
				return;	// �޼ҵ� ����
			}
			
//			������
//			System.out.println("�й�: " + newStudent.getStudentNumber());
//			System.out.println("�̸�: " + newStudent.getName());
//			System.out.println("��ȭ��ȣ: " + newStudent.getPhoneNumber());
//			System.out.println("�޸�: " + newStudent.getMemo());
//			System.out.println("���� �������� ����� ���� >>> ");
//			boolean[] classCheck = newStudent.getClassCheck();
//			int[] classScore = newStudent.getClassScore();
//			for(int i=0; i < classCheck.length; i++) {
//				if(classCheck[i]) { // ������û�� ������ boolean ���� true�� �ֵ鸸 ���ͼ� �Է���. false�� �ش� X
//					System.out.println("�����: " + className[i] + " / ����: " + classScore[i]);
//				}
//			}
			printStudent(newStudent);
		}
		
		private void All() {
			for(Student student : students) {
//				������
//				System.out.println("�й�: " + student.getStudentNumber());
//				System.out.println("�̸�: " + student.getName());
//				System.out.println("��ȭ��ȣ: " + student.getPhoneNumber());
//				System.out.println("�޸�: " + student.getMemo());
//				System.out.println("���� �������� ����� ���� >>> ");
//				boolean[] classCheck = student.getClassCheck();
//				int[] classScore = student.getClassScore();
//				for(int i = 0; i < classCheck.length; i++) {
//					if(classCheck[i]) {
//						System.out.println("�����: " + className[i] + " / ����: " + classScore[i]);
//					}
//				}
				printStudent(student);
			}
		}
		
		private void printStudent(Student student) { // ������ȸ ��� �޼ҵ�
			System.out.println("�й�: " + student.getStudentNumber());
			System.out.println("�̸�: " + student.getName());
			System.out.println("��ȭ��ȣ: " + student.getPhoneNumber());
			System.out.println("�޸�: " + student.getMemo());
			System.out.println("���� �������� ����� ���� >>> ");
			boolean[] classCheck = student.getClassCheck();
			int[] classScore = student.getClassScore();
			for(int i = 0; i < classCheck.length; i++) {
				if(classCheck[i]) { // list.get(i) ArrayList�� �ε��� ��ȣ ��������
					System.out.println("�����: " + className.get(i) + " / ����: " + classScore[i]);
				}
			}
		}
}
