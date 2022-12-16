package javaPractice.ch_09.abstractClass;


abstract class Animal { // 추상 클래스 Animal
	// 필드
	private String name;
	
	// 생성자
	public Animal(String name) {
	this.name= name;
	}
	   
	// 메소드
    public String getName() {
      return name;
    }
	   
	// 추상 메소드
    public abstract void bark();
    public abstract String toString();
   
    public void introduce() {
      System.out.print(toString()+"입니다.");
      bark();
    }
}

class Cat extends Animal {
	   private int age;
	   
	   public Cat(String name, int age) { // 생성자
	      super(name); this.age=age;
	   }
	   public void bark() {
	      System.out.println("야옹");
	   }
	   public String toString() {
	      return age + "살이 된 " + getName();
	   }
}

class Dog extends Animal {
	   private String type;
	   
	   public Dog(String name, String type) {
	      super(name); this.type = type;      
	   }
	   @Override
	   public void bark() {
	      System.out.println("멍멍");
	      
	   }
	   @Override
	   public String toString() {
	      return type + "인 " +getName();
	   }
	   
}


public class AbstractMethod02 {

	public static void main(String[] args) {
		Animal[] animals = {
				new Dog("바둑이", "삽살개"),	// 개
				new Cat("아롱이", 7),			// 고양이
				new Dog("백두", "진돗개"),		// 개
		};
		
		 for(Animal animal : animals) {
	         animal.introduce();
	         System.out.println();
	      }


	}

}
