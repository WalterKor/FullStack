package ch06;

public class VariadicArgumentsExam {
	public static void main(String[] args) {
		
		Calc2 c1 = new Calc2();
		int result = c1.sum(10, 20);
		System.out.println("result : " +result);
		result = c1.sum(10, 20, 30);
		System.out.println("result : " +result);
		result = c1.sum(10, 20, 30, 40);
		System.out.println("result : " +result);
		result = c1.sum(10, 20, 30, 40, 50);
		System.out.println("result : " +result);
	}//end of main
}//end of class

class Calc2{
	int sum(int...vals) {
		int sum = 0;
		for(int i=0; i<vals.length;i++) {
			sum += vals[i];
		}
		return sum;
	}
}