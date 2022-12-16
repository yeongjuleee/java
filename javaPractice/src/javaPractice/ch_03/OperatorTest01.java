package javaPractice.ch_03;

public class OperatorTest01 {

	public static void main(String[] args) {
		// 증감 연산자 이해하기 1.
		
		int i = 5, j = 5;
		System.out.println(i++);  // i 가 5 출력 후에 증가함.
		
		System.out.println(++j); // j가 증가된 후 출력 => 6
		
		System.out.println("i =" + i + ", j =" + j);  // i가 5가 출력된 후 ++ 되어 6이 되어있음. 그래서 i 와 j의 값이 동일해짐.
		
		
		// 증감 연산자 이해하기 2. (복합적으로 구성되어 있을 때 값 예측해보기)
		
		int x = 5;
		int y = 0;
		y = x++; // y에 x 값을 저장하고 난 후에 ++ 가 일어남. 따라서 x 는 6, y 는 5.
		System.out.println("y = x++; 실행 후, x=" + x + ", y="+ y); // y= x++ 실행후, x= 6 , y= 5
		
		//결과르 비교하기 위해 x와 y 값을 다시 5와 0으로 변경
		x = 5;
		y = 0;
		y = ++x;
		System.out.println("y= ++x; 실행 후, x="+ x +", y="+ y); // y= ++x; 실행 후, x= 6, y= 6
	}

}
