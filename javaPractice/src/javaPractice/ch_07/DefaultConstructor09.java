package javaPractice.ch_07;



public class DefaultConstructor09 {
	
		/*
		setter: Ŭ���� �ܺο��� ���� �޾ƿ� ��� ������ ����
		return type�� void
		�Ű� ������ ������ ��� ������ ���� type�� ����
		�̸� �տ� set�� ���̰� �ڿ��� ������ ��� ���� �̸�
		
		getter: Ŭ���� �ܺο� ��� ������ ���� ����(��ȯ)
		return type�� ������ ��� ������ �ڷ����� ��ġ
		�Ű����� �ʿ�X
		�̸� �տ� get�� ���̰� �ڿ� ������ ��� ���� �̸�
		*/
	
		private String name;
		private int age;
		private short grade;
		private double avg;
		private int[] numArr; // �迭

		
		// getter, setter ������ ��
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
