package ch06;

public class PolymorMission {
	public static void main(String[] args) {
		
		Cat cat = new Cat();
		Pig pig = new Pig();
		Hamster hamster = new Hamster();
		
		
		PolymorMission.cry(cat);
		PolymorMission.cry(pig);
		cry(hamster);
		
	}//end of main
	static void cry(Animal cat) {
		cat.howling();
	}
	
}//end of class

class Pig extends Animal{

	@Override
	void howling() {
		System.out.println("²Ü~²Ü");
	}
		
}//end of pig

class Hamster extends Animal{
	
}

