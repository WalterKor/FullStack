package ch06;

public class StaticExam5 {
	public static void main(String[] args) {
		//n1 = 10;
		//n2 = 20;
		//sum() �޼ҵ带 ȣ���ϰ� ������� �ֿܼ� �����ð�
		
		Test t1 = new Test();
		t1.n1 = 10;
		t1.n2 = 10;
		
		int result = t1.sum();
		System.out.println("n1 + n2 : " + result );
			
	}//end of main
}//end of class

class Test{
	int n1;
	int n2;
	
	public int sum() {
		return n1 + n2;
	}
}