package Interface;

public abstract class Calculator implements Calc {

	@Override
	public int add(int num1, int num2) {//모든 메서드를 구현해라
		return (num1 + num2);
	}

	@Override
	public int substract(int num1, int num2) {
		return (num1 - num2);
	}


	
}