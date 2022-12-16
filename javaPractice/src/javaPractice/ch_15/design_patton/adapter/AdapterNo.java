package javaPractice.ch_15.design_patton.adapter;

class ServiceA {
	void runWork() {
		System.out.println("work");
	}
}

class ServiceB {
	void runStudy() {
		System.out.println("study");
	}
}

class AdapterServiceA {
	ServiceA serviceA = new ServiceA();
	
	void runService() {
		serviceA.runWork();
	}
}

class AdapterServiceB {
	ServiceB serviceB = new ServiceB();
	
	void runService() {
		serviceB.runStudy();
	}
}

public class AdapterNo {

	public static void main(String[] args) {
		ServiceA serviceA = new ServiceA();
		ServiceB serviceB = new ServiceB();
		
		serviceA.runWork();
		serviceB.runStudy();
		
		AdapterServiceA asa1 = new AdapterServiceA();
		AdapterServiceB asb1 = new AdapterServiceB();
		
		// 동일한 메소드 명을 사용할 수 있다!
		asa1.runService();
		asb1.runService();
		
		

	}

}
