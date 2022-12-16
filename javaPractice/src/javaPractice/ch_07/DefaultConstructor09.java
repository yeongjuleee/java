package javaPractice.ch_07;



public class DefaultConstructor09 {
	
		/*
		setter: 클래스 외부에서 값을 받아와 멤버 변수에 저장
		return type은 void
		매개 변수는 수정할 멤버 변수와 같은 type만 가능
		이름 앞에 set을 붙이고 뒤에는 수정할 멤버 변수 이름
		
		getter: 클래스 외부에 멤버 변수의 값을 전달(반환)
		return type은 참조할 멤버 변수의 자료형과 일치
		매개변수 필요X
		이름 앞에 get을 붙이고 뒤에 리턴할 멤버 변수 이름
		*/
	
		private String name;
		private int age;
		private short grade;
		private double avg;
		private int[] numArr; // 배열

		
		// getter, setter 생성할 것
		public void setName(String name) {
			this.name = name;
		}
		
		public String getName() {
			return name;
		}
		
		public void setAge(int age) {
			this.age = age;
		}
		
		public int getAge() {
			return age;
		}
		
		public void setGrade(short grade) {
			this.grade = grade;
		}
		
		public short getGrade() {
			return grade;
		}
		
		public void setAvg(double avg) {
			this.avg = avg;
		}
		
		public double getAvg() {
			return avg;
		}
		
		public void setNumArr(int[] numArr) {
			this.numArr = numArr;
		}
		
		public int[] getNumArr() {
			return numArr;
		}
		
		
	
	public static void main(String[] args) {
		

	}

}
