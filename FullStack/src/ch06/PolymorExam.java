package ch06;

public class PolymorExam {
	/*
	 1. 부모타입의 변수는 자식객체를 가리킬 수 있다.
	 2. 자식타입의 변수는 부모객체를 가리킬 수 없다.
	 3. 타입은 아는 메소드만 호출할 수 있다.
	 4. 호출이 되었다면 기준은 객체이다.
	 */
	
	public static void main(String[] args) {
		
		Animal a1 = new Cat();
		Cat cat = (Cat)a1;
		Animal a2 = cat;
		
		
		a1.howling();
		cat.howling();
		cat.lick();
		
		System.out.println("끝");
		
	}

}
