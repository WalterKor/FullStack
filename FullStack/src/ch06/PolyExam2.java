package ch06;

public class PolyExam2 {
/*
 	1. 부모타입은 자식객체 주소값을 참조 할 수 있다.(가리킬 수 있다.) 상속관계에서만 위 아래에서만  
 	2. 자식타입은 부모객체 주소값을 참조 할 수 없다. 
 
 */
	public static void main(String[] args) {
		Animal ani1 = new Hamster();
		Animal ani2 = new Animal();
//		Hamster ani2 = new Animal();
		Hamster ham = (Hamster)ani1;
		Hamster ham = (Hamster)ani2;
		System.out.println("끝");
		
	}
}
