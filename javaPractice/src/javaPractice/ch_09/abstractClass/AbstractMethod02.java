package javaPractice.ch_09.abstractClass;


abstract class Animal { // �߻� Ŭ���� Animal
	// �ʵ�
	private String name;
	
	// ������
	public Animal(String name) {
	this.name= name;
	}
	   
	// �޼ҵ�
    public String getName() {
      return name;
    }
	   
	// �߻� �޼ҵ�
    public abstract void bark();
    public abstract String toString();
   
    public void introduce() {
      System.out.print(toString()+"�Դϴ�.");
      bark();
    }
}

class Cat extends Animal {
	   private int age;
	   
	   public Cat(String name, int age) { // ������
	      super(name); this.age=age;
	   }
	   public void bark() {
	      System.out.println("�߿�");
	   }
	   public String toString() {
	      return age + "���� �� " + getName();
	   }
}

class Dog extends Animal {
	   private String type;
	   
	   public Dog(String name, String type) {
	      super(name); this.type = type;      
	   }
	   @Override
	   public void bark() {
	      System.out.println("�۸�");
	      
	   }
	   @Override
	   public String toString() {
	      return type + "�� " +getName();
	   }
	   
}


public class AbstractMethod02 {

	public static void main(String[] args) {
		Animal[] animals = {
				new Dog("�ٵ���", "��찳"),	// ��
				new Cat("�Ʒ���", 7),			// �����
				new Dog("���", "������"),		// ��
		};
		
		 for(Animal animal : animals) {
	         animal.introduce();
	         System.out.println();
	      }


	}

}
