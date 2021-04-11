package ch06;

public class StaticExam3 {
	public static void main(String[] args) {
		CalcInstance c1 = new CalcInstance();
		int result = c1.sum(10, 20);
		System.out.println("result : " + result );
		
		int result2 = CalcStatic.sum(10, 30);
		int result3 = CalcStatic.sum(10, 40);
		System.out.println("result2 : " +result2);
		System.out.println("result3 : " +result3);
		
	
		
		
		
	}//end of main
}//end of class

class CalcStatic {
//	int sum2(int num1, int num2) {
//		return num1+num2;
//	}
	
	static int sum(int num1 ,int num2) {//static메모리에 먼저 올라가있기때문에 
		return num1 + num2;				//굳이 객체화 하지 않아도 된다. 
	}
}

class CalcInstance{
	int sum(int num1, int num2) {
		return num1 + num2;
	}
	
}