package javaPractice.ch_17.db_school;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManage {
		// 필드
		private ArrayList<Person> list; // 학생 
		private Scanner input;	// 입력
		private StudentDAO studentDAO;	// 학생 수업 저장
		//private ArrayList<SubjectDAO> sub;	// 수업 데이터 베이스
		private SubjectDAO subjectDAO;	// 수업 데이터 베이스
		//private ArrayList<StudentDAO> stdC;	// 학생 수업 저장
		private StdClassDAO stdClassDAO;	// 학생 수업 저장
		
		
		// 생성자
		public StudentManage() {
			studentDAO = new StudentDAO();
			subjectDAO = new SubjectDAO();
			list = new ArrayList<Person>();
			input = new Scanner(System.in);
			//sub = new ArrayList<SubjectDAO>();
			//stdC = new ArrayList<StudentDAO>();
			stdClassDAO = new StdClassDAO();
		}
		
		// DB 연결 해제
		public void disConnect() {
			studentDAO.disConnect();
		}
		
		// 0. 학생 조회
		private Person findStudentTraverse(int stdNum) {
			// 해당 코드 찾기
			for (Person std : list) {
				if(std.getStudentNumber() == stdNum) {
					return std;
				}
			}
			return null;
		}
		
		// 0. 중복 학번 찾기
		private boolean isStudent(int stdNum) {
			return (findStudentTraverse(stdNum) == null) ? false : true;
		}
		
		// 0. 학번 입력하기
 		public int stdNum() { 
			System.out.print("학생의 학번을 입력하세요 >> ");
			int studentNumber = input.nextInt();
			return studentNumber;
		}
		

		// 1. 학생 추가
		public void addStudent() { 		
			Person std = new Person();
			int studentNumber = stdNum();	
			
			// 입력한 학번으로 새로운 학생을 생성하기
			if(studentDAO.isStudent(studentNumber)) {
				System.out.print("\n이미 존재하는 학번입니다. \n다른 번호를 입력해 주세요. \n \n");
			}
			else {
				std.setStudentNumber(studentNumber);
				System.out.print("이름을 입력하세요 >> ");
				std.setName(input.next());	// 문자열 입력 받아 setName에 전달
				System.out.print("전화번호를 입력하세요 >> ");
				std.setPhoneNumber(input.next());
				System.out.print("메모를 입력하세요 >> ");
				std.setMemo(input.next());
				studentDAO.insertStudent(std);
				
				System.out.println("학생 추가가 완료되었습니다." + "\n");
			}
			
		}
		
		// 2. 학생 삭제 
		public void removeStudent() { 
			Person std = new Person();
			int studentNumber = stdNum();
			std.setStudentNumber(studentNumber);
			
			// 입력한 학번으로 학생 삭제하기 
			if(!studentDAO.isStudent(studentNumber)) {
				System.out.println("Error: 존재하지 않는 학번입니다!!");
			}
			else {
				studentDAO.deleteStudent(std);
				System.out.println("학생 삭제가 완료되었습니다. \n");
			}
		}
/*		
		// 3. 수강 신청
		public void addClass() {
			
			while(true) { // 메뉴 안에 메뉴
				System.out.println("메뉴를 선택해 주세요. 1. 수강 신청 / 2. 수강 취소 / 3. 메인으로");
				int subjectMenu = input.nextInt();
				
				switch(subjectMenu) {
					case 1: // 1. 과목 등록
						setClass();
						break;
					
					case 2: // 2. 수강 취소
						cancleClass();
						break;
						
					case 3: // 3. 메인으로
						return;
						
					default:
						System.out.println("잘못된 입력입니다.");
				}
			}
			
		}
		
		// 수강신청 3-1. 수강 신청
		public void setClass() {
			StdClassDTO stdClassDTO = new StdClassDTO();
			
			System.out.println("수강 신청 할 과목의 코드를 입력하세요: ");
	          stdClassDTO.setSubjectCode(input.nextInt());
	          System.out.println("수강신청할 학생의 학번을 입력하세요: ");          
	          stdClassDTO.setStudentNumber(input.nextInt());
	          
	          if(stdClassDAO.insertClass(stdClassDTO)) {
	        	  System.out.println("수강신청이 완료 되었습니다.");
	          }
	          else {
	        	  System.out.println("수강 신청에 실패했습니다.");
	          }
		}
		
		// 수강신청 3-2. 수강 취소
		public void cancleClass() {
			StdClassDTO stdDTO = new StdClassDTO();
			
			System.out.println("수강 취소할 강의 번호를 입력해주세요: ");
			stdDTO.setSubjectCode(input.nextInt());
			System.out.println("수강 취소할 학생의 학번을 입력해주세요: ");
			stdDTO.setSubjectCode(input.nextInt());
			
			if(stdClassDAO.deleteSubject(stdDTO)) {
				System.out.println("수강 취소가 완료되었습니다.");
			}
			else {
				System.out.println("수강 취소에 실패했습니다.");
			}
		}
		
*/
		// 3. 수강신청
		// 3-1. 과목 목록 출력
	   private void printSubject() {
	      SubjectDTO subject = new SubjectDTO();
	      ArrayList<SubjectDTO> list = subjectDAO.selectAll();
	      
	      for(SubjectDTO subject3 : list) {
	         System.out.println("과목코드 : " + subject3.getCode() + " " + "과목이름 : " + subject3.getSubjectName() );
	      }
	   }
	   private void printCourse() {
	      StdClassDTO course = new StdClassDTO();
	      ArrayList<StdClassDTO> list = stdClassDAO.selectAll();
	      for(StdClassDTO course2 : list) {
	         System.out.println("과목코드 : " + course2.getSubjectCode() + " " + "과목이름: " + course2.getStudentNumber());
	      }
	      
	   }
		
		
		// 3-2. 수강신청
		public  void addClass() {
	 		System.out.println("학생의 학번을 입력하세요. >>>");
	 		int studentNumber = input.nextInt(); //학번 입력받음

	 		while(true) {
	 			System.out.println("메뉴를 선택하세요 : 1. 수강신청 / 2. 수강포기 / 3. 종료");
	 			int classMenu = input.nextInt();
	 			switch(classMenu){
	 				case 1:
	 				    printSubject();
	 					System.out.println("수강신청 할 과목 코드를 선택하세요 : ");

	 					int code =input.nextInt();
	 					StdClassDTO course = new StdClassDTO();
	 					course.setSubjectCode(code);
	 					course.setStudentNumber(studentNumber);
	 					stdClassDAO.insertCourse(course);

	 					System.out.println("학번 " + studentNumber+ " 학생이 " + code + " 과목을 수강신청완료했습니다.");
	 					break;
	 				case 2:
	 					System.out.println("수강 포기 할 과목코드를 선택하세요 : ");
	 					int code2 = input.nextInt();
	 						stdClassDAO.deleteCourse(code2);
	 						System.out.println("과목을 삭제했습니다.");
	 					break;
	 				case 3:
	 					return;
	 			}
	 		}
	 	}
		
		// 4. 성적 입력
		public void setScore() { 
			int studentNumber = stdNum();
			
			Person newStudent = findStudentInform(studentNumber);
			if(newStudent == null) { // 만약 기존 학생 정보가 없다면,
				System.out.println("Error: 학생이 존재하지 않습니다.");
				return;	// 메소드 종료
			}
			
			while(true) { // 성적을 입력하기 위해 과목을 먼저 선택.
				System.out.println("성적을 입력/수정 할 과목을 선택하세요 " + toString() + " / 5. 종료");
				int classMenu = input.nextInt();
				if(classMenu == 5) { // 종료 체크
					break; // while문 종료
				}
				

				System.out.print("성적을 입력하세요. >>> ");
				int score = input.nextInt();
				if(score < 0 || score > 100) { // 성적이 0 ~ 100 까지인지 확인
					System.out.println("Error: 성적은 0부터 100 사이의 숫자만 입력해 주세요!");
					continue;	// 처음으로 돌아감
				}
				
			}
		}
		
		// 5. 학생 정보 조회 (전 단계)
		public Person findStudentInform(int studentNumber) {
			for (Person student : list) {
				if (student.getStudentNumber() == studentNumber) {
					System.out.println("해당 학생의 정보는 다음과 같습니다.");
					System.out.println("이름: " + student.getName());
					System.out.println("전화번호: " + student.getPhoneNumber());
					System.out.println("메모: " + student.getMemo());
					return student;
				}
			} return null;
		}
		
		// 5. 정보 조회
		public void infoStudent() { 
			System.out.println("메뉴를 선택해 주세요 1. 특정 학생만 / 2. 전체 학생");
			int menu = input.nextInt();
			switch(menu) {
				case 1 : // 특정 학생의 성적 정보
					One();
					break;
					
				case 2 : // 전체 학생의 성적 정보
					All();
					break;
			}
		}
		
		private void One() {
			int studentNumber = stdNum();
			
			Person std = studentDAO.selectOne(studentNumber);
			if(std != null ) { // 만약 기존 학생의 정보가 있다면
				printStudent(std);
			}
			else {
				System.out.println("학번 조회에 실패했습니다.");
			}
		}
		
		private void All() {
			ArrayList<Person> Studentlist = studentDAO.selectAll();
		      for (Person student : Studentlist) {
		         printStudent(student);
		      }      
		}
		
		private void printStudent(Person student) { // 정보조회 출력 메소드
			System.out.println("학번: " + student.getStudentNumber());
			System.out.println("이름: " + student.getName());
			System.out.println("전화번호: " + student.getPhoneNumber());
			System.out.println("메모: " + student.getMemo());
			System.out.println("현재 수강중인 과목과 성적 >>> ");
			
		}
		
		// 6. 수강과목 관리
		public void subjectInfo() {
			
			while(true) { // 메뉴 안에 메뉴
				System.out.println("메뉴를 선택해 주세요. 1. 과목 등록 / 2. 과목 삭제 / 3. 메인으로");
				int subjectMenu = input.nextInt();
				
				switch(subjectMenu) {
					case 1: // 1. 과목 등록
						addSubject();
						break;
					
					case 2: // 2. 과목 삭제
						removeSubject();
						break;
						
					case 3: // 3. 메인으로
						return;
						
					default:
						System.out.println("잘못된 입력입니다.");
				}
			}
			
		}
		
		// 6-1. 과목 등록
		private void addSubject() {
			SubjectDTO subject = new SubjectDTO();
			System.out.println("등록할 강의 번호를 입력해 주세요: ");
			int code = input.nextInt();
			
	
			if(subjectDAO.isSubject(code)) {
				System.out.println("\n이미 존재하는 강의번호 입니다. \n다른 번호를 입력해 주세요. \n \n");
			}
			else {
				subject.setCode(code);
				System.out.println("과목 이름을 입력하세요 >>> ");
				subject.setSubjectName(input.next());
				
				if(subjectDAO.insertSubject(subject)) {
					System.out.println("과목이 등록 되었습니다.");
				}
				else {
					System.out.println("과목 등록에 실패했습니다.");
				}
			}
			
		}
		
		// 6-2. 과목 삭제
		private void removeSubject() {
			SubjectDTO subject = new SubjectDTO();
			System.out.println("삭제할 강의 번호를 입력해 주세요: ");
			int code = input.nextInt();
			
			subject.setCode(code);
			
			if(!subjectDAO.isSubject(code)) {
				System.out.println("Error: 존재하지 않는 과목 번호 입니다!!");
			}
			else {
				subjectDAO.deleteSubject(subject);
				System.out.println("과목  삭제가 완료 되었습니다.");
			}
		}

}
