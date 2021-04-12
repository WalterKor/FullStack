package ch06;

public class PolymorMission {
	public static void main(String[] args) {
		
		Animal cat = new Cat();
		Animal pig = new Pig();
		Animal hamster = new Hamster();//Animal메서드에서만 사용가능하다.
		
		//새롭게 햄스터 객체를 만들지 않고 
		//hamster주소값을 활용하여 runRail();메서드를 호출해라 
		
		//강사님의 답
		/*
		Hamster ham = (Hamster)hamster;
		ham.runRail();
		*/
		System.out.println(hamster instanceof Hamster);//true 
		System.out.println(hamster instanceof Pig);//false
		
		
		
		
		//Hamster hhh = (Hamster)pig; 컴파일 에러
		//System.out.println(참조변수 instanceof 클래스); 부모 자식간인지 확인하기 쉬운거
		
		//내가한 답
		/*
		((Pig)pig).eating();
		((Hamster) hamster).runRail();//다운캐스팅?이게 업캐스팅인가?
		*/
		
		PolymorMission.cry(cat);
		PolymorMission.cry(pig);
		cry(hamster);
		
		
	}//end of main
	
	//ani로 Hamster객체의 주소값이 들어오면 
	//howling 메소드말고 
	//runRail()메소드 호출하도록
	
	static void cry(Animal ani) {
		
		if(ani instanceof Hamster) {
			((Hamster) ani).runRail();
		}else {
			ani.howling();
		}
		
	}
	
}//end of class

class Pig extends Animal{

	@Override
	void howling() {
		System.out.println("꿀~ 꿀");
	}
	void eating() {
		System.out.println("냠냠");
	}
	
		
}//end of pig

class Hamster extends Animal{
	public void runRail() {
		System.out.println("쳇바퀴를 굴리다.");
	}
}

