package ch06;

public class StaticExam4 {
	public static void main(String[] args) {
		
		CalcStatic2.num1 = 10;
		CalcStatic2 cs2 = new CalcStatic2();
		
		int result = cs2.sum();
		String.format("%d", result);
		
		String str = new String();
		System.out.println(str.format("%d", result));
		
		
		
	}//end of main

}//end of class

class CalcStatic2{
	static int num1;
	static int num2;
	
	static int sum() {
		return num1 + num2;
	}
	
}

class CalcInstance2{
	int num1;
	int num2;
	
	int sum() {
		return num1 + num2;
	}
	
	static int sum(int num1,int num2) {
		return num1 + num2;
	}
	
	
	
}