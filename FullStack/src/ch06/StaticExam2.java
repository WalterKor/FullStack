package ch06;

public class StaticExam2 {
	public static void main(String[] args) {
		
		Toy2.makeCount = 10;//static���� �ؼ� �ٷ� ��ġ�ų� �����ϴ�. 
//		Toy2 t1 = new Toy2();//Toy3.makeCount = 1
		
		System.out.println("Toy2 : " +Toy2.makeCount);
		System.out.println("Toy3 : " +Toy3.makeCount);
		
	}//end of main
}//end of class

class Toy2{
	static int makeCount = 0;
	Toy2(){
		Toy3.makeCount++;
	}
}

class Toy3{
	static int makeCount = 0;
}
