package javaPractice.ch_17.db_school_yoon;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Scanner;

import account_1213.Account;

public class StudentManage {
	
	private ArrayList<Student> Studentlist;	
	private ArrayList<SubjectDTO> Subjectlist;
	private Scanner input;
	private StudentDAO studentDAO;
	private SubjectDAO subjectDAO;
	private StdClassDAO stdClassDAO;
	
	
	public StudentManage() {
		studentDAO = new StudentDAO();
		studentDAO.getConnStudent();
		
		subjectDAO = new SubjectDAO();
		subjectDAO.getConnStudent();
		
		stdClassDAO = new StdClassDAO();
		stdClassDAO.getConnStudent();

		
		Studentlist = new ArrayList<Student>();
		input = new Scanner(System.in);
	}
	
	//학생 정보 찾기
	public Student findStudentInform(int studentNumber) {
		for (Student student: Studentlist) {
			if(student.getStudentNumber() == studentNumber) {
				System.out.println("해당 학생의 정보는 다음과 같습니다");
				System.out.println("이름 : " + student.getName());
				System.out.println("전화번호 : " +student.getPhoneNumber());
				System.out.println("메모 : "+student.getMemo());
				return student;			
			}
		}return null;
	}	

	private Student findAccount(int studentNumber) {
		//입금, 출금, 조회 시 계좌 찾기
		Student student = findStudentInform(studentNumber);
		if (student == null) {
			System.out.println("학생을 찾을 수 없습니다.");
		}
		return student;
	}
	
	
	
	//학생 추가 및 수정..은 못함
	public void addStudent() {
		Student student = new Student();
		
		System.out.print("학생의 학번을 입력하세요. >>>");
		int studentNumber = input.nextInt();
		
		if(studentDAO.isStudent(studentNumber)) {
			System.out.println("이미 존재하는 학번입니다.");			
		}
		else {
			student.setStudentNumber(studentNumber);
			
			System.out.print("학생의 이름을 입력하세요. >>>");
			student.setName(input.next());
			System.out.print("학생의 전화번호를 입력하세요. >>>");
			student.setPhoneNumber(input.next());
			System.out.print("메모를 입력하세요. >>>");
			student.setMemo(input.next());
			
			System.out.println("학생 추가 완료 \n");			
			
			if(studentDAO.insertStudent(student)) {
				System.out.println("학생 정보가 등록되었습니다.");
					
			}
			else {
				System.out.println("학생 정보 등록에 실패했습니다.");
			}
		}
	}	
				
	//학생 삭제
	public void removeStudent() {
		
		Student student = new Student();
		System.out.print("학생의 학번을 입력하세요. >>>");
		int studentNumber = input.nextInt();
		student.setStudentNumber(studentNumber);
		
		if(studentDAO.isStudent(studentNumber)) {
			studentDAO.deleteStudent(student);			
			System.out.println("학생 정보를 삭제했습니다.");
		}
		else {
			System.out.println("학번 조회에 실패했습니다.");
		}
		
		
	}		
	
	public void addClass() { // 수강 신청
		
      while(true) { // 메뉴 안에 메뉴
          System.out.println("메뉴를 선택하세요: 1. 수강신청 / 2. 수강취소 / 3. 종료");
          int classMenu = input.nextInt();
          switch(classMenu) {
             case 1 :            	 
                setClass();                
                break;
             
             case 2 : 
                cancleClass();               
                break;
                
             case 3 :
                return;
          }
       }
   }
	
	public void setClass() {
		StdClassDTO stdClassDTO = new StdClassDTO();		
		
		System.out.println("수강 신청 할 과목의 코드를 입력하세요. >>>");
   	 	stdClassDTO.setCode(input.nextInt());
   	 	System.out.println("수강신청할 학생의 학번을 입력하세요. >>>");   	 	
   	 	stdClassDTO.setStudentNumber(input.nextInt());

	
		if(stdClassDAO.insertClass(stdClassDTO)) {
			System.out.println("수강 신청이 완료되었습니다.");						
		}
		else {
			System.out.println("수강 신청에 실패했습니다.");
		}		
					   	 	
	}
	
	public void cancleClass() {
		StdClassDTO stdClassDTO = new StdClassDTO();		
		
		System.out.println("수강 취소 할 과목의 코드를 입력하세요. >>>");
   	 	stdClassDTO.setCode(input.nextInt());
   	 	System.out.println("수강 취소할 학생의 학번을 입력하세요. >>>");   	 	
   	 	stdClassDTO.setStudentNumber(input.nextInt());

	
		if(stdClassDAO.deleteClass(stdClassDTO)) {
			System.out.println("수강 취소가 완료되었습니다.");						
		}
		else {
			System.out.println("수강 취소에 실패했습니다.");
		}		
	}


	//성적 입력		
	/*public void setScore() {
		System.out.print("학생의 학번을 입력하세요. >>>");
		int studentNumber = input.nextInt();
		
		Student newStudent = findStudentInform(studentNumber);
		if(newStudent == null) {
			//만약 기존의 학생의 정보가 없다면
			System.out.println("Error : 학생이 존재하지 않습니다!");
			return;
		}
		while(true) {
			System.out.println("과목을 선택하세요: " +className.toString()+ "종료");
			int classMenu = input.nextInt();
			if(classMenu == 4) {
				break;
			}
			if(!newStudent.getClassCheck()[classMenu-1]) {
				System.out.println(className.get(classMenu-1)+"은 미신청 과목입니다");
				continue;	//미신청 과목이기 때문에 처음으로 돌아감
			}
			System.out.print("성적을 입력하세요. >>>");
			int score = input.nextInt();
			if(score < 0 || score >100) {
				System.out.println("Error : 성적은 0~100점까지 입력할 수 있습니다");
				continue;
			}
			//정상적인 과목과 성적이 입력된 경우
			newStudent.setClassScore(classMenu-1,score);
			//해당 학생의 score를 업데이트
			System.out.println(className.get(classMenu-1)+"의 성적 입력이 완료되었습니다.");
		}
						
	}
	*/
	
	public void subjectManage() {
		
		System.out.println("메뉴를 선택해주세요 >> 1. 과목 등록 / 2. 과목 삭제 / 3. 메인 메뉴로");		
		int sub = input.nextInt();
		
		SubjectDTO subjectDTO = new SubjectDTO();
		switch(sub) {
		case 1:
			addSubject();
			break;
		case 2:
			removeSubject();
			break;
		case 3:
			return;
		default :
		    System.out.print( "잘못 입력하였습니다." ) ;
		
		}
	}
	
	public void addSubject() {
		SubjectDTO subjectDTO = new SubjectDTO();
		
		System.out.print("등록할 과목 코드를 입력하세요. >>>");
		int code = input.nextInt();
		
		if(subjectDAO.isSubject(code)) {
			System.out.println("이미 존재하는 학번입니다.");			
		}
		else {
			subjectDTO.setCode(code);
			
			System.out.print("과목의 이름을 입력하세요. >>>");
			subjectDTO.setSubjectName(input.next());			
								
			if(subjectDAO.insertSubject(subjectDTO)) {
				System.out.println("과목이 등록되었습니다.");
					
			}
			else {
				System.out.println("과목 등록에 실패했습니다.");
			}
		}
	}	
	
	public void removeSubject() {
		
		SubjectDTO subjectDTO = new SubjectDTO();
		System.out.print("과목 코드를 입력하세요. >>>");
		int code = input.nextInt();
		subjectDTO.setCode(code);
		
		if(subjectDAO.isSubject(code)) {
			subjectDAO.deleteSubject(subjectDTO);			
			System.out.println("해당 과목을 삭제했습니다.");
		}
		else {
			System.out.println("과목 조회에 실패했습니다.");
		}
		
		
	}		
	
	//학생 정보 조회
	public void informStudent() {
		System.out.println("메뉴를 선택해주세요 >> 1. 특정 학생만 / 2. 전체 학생");
		int menu = input.nextInt();
		switch(menu) {
		case 1:
			One();
			break;
		case 2:
			All();
			break;
		
		}
	}
	
	//개별 조회
	public void One() {
		System.out.print("학생의 학번을 입력하세요. >>>");
		int studentNumber = input.nextInt();
		
		Student student = studentDAO.selectOne(studentNumber);
		if(student != null) {
			printStudent(student);
		}
		else {
			System.out.println("학번 조회에 실패했습니다.");
		}
			
	}
	//전체 조회
	public void All() {
		ArrayList<Student> Studentlist = studentDAO.selectStudent();
		for (Student student : Studentlist) {
			printStudent(student);
		}		
	}
	
	//프린트 메소드
	private void printStudent(Student student) {
		System.out.println("학번 : "+student.getStudentNumber());
		System.out.println("이름 : "+student.getName());
		System.out.println("전화번호 : "+student.getPhoneNumber());
		System.out.println("메모 : "+student.getMemo());
		
		}	
	
	private void printSubject(SubjectDTO subjectDTO) {
		System.out.println("과목 코드 : "+subjectDTO.getCode());
		System.out.println("과목 이름 : "+subjectDTO.getSubjectName());
	}
}

