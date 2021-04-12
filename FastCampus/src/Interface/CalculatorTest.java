package Interface;

public class CalculatorTest {
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 2;
		
		Calc calc = new CompleteCalc();
		System.out.println(calc.add(num1, num2));//12
		System.out.println(calc.substract(num1, num2));//8
		System.out.println(calc.divide(num1, num2));//5
		System.out.println(calc.times(num1, num2));//20
		
		
	}

}
