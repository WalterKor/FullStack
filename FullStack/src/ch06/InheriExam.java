package ch06;

public class InheriExam {
	public static void main(String[] args) {
		
		Koshort ks = new Koshort();
		ks.howling();
	}

}

class Animal extends Object {
	String name;
	int age;

	void howling() {
		System.out.println("운다.");
	}
}

class Cat extends Animal {
	void lick() {
		System.out.printf("%s�� �q��.\n", name);
	}

	@Override
	void howling() {
		System.out.println("야옹");
	}

}

class Koshort extends Cat{
	
	Koshort(){
		super();
		System.out.println("Koshort�� ������");
	}
	
	void pee() {
		System.out.printf("%s�� �Һ��� ����\n",name);
	}
}


