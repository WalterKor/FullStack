package ch06;

public class StaticExam {
	public static void main(String[] args) {
		
		Toy t1 = new Toy();
		Toy t2 = new Toy();
		
		t1.name = "������";
		System.out.println("t1.name : " + t1.name);
		System.out.println("----------------------------");
		
		t2.name = "�Ե�";
		System.out.println("t2.name : " + t2.name);
		System.out.println("----------------------------");
		Toy.name = "��ȣ";
		
		System.out.println("t1.name : " +t1.name);
		System.out.println("t2.name : " +t2.name);
		System.out.println("Toy.name : " +Toy.name);
		
		
		
	}//end of main
}//end of class

class Toy{
	static String name;
}
