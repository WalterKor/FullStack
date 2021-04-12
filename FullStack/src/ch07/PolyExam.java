package ch07;

public class PolyExam {

	/*
	 1. 부모타입은 자식 객체를 가리킬 수 있다. 참조,저장
	 2. 자식타입은 부모 객체 가리킬 수 없다.
	 3. 변수타입은 메소드 호출 여부만 결정한다. 
	  	(자기가 아는것만 호출 가능하다.)
	  	호출이 되었다면 실행 되는 것은 객체 기준이다.
	  	Car car1 => Car 변수타입 
	 */
	
	public static void main(String[] args) {
		
		Car car1 = new Bus();//부모타입 자식객체
		Car car2 = new Car();//이건 당연한거고 
		Car car3 = new LocalBus();//이건 당연한거고 
		
		Bus bus1 = (Bus)car1;
		Car carp = bus1;
		carp.hoot();
		
		//Bus bus1 = (Bus)car2; 제대로 작동하지 않는다.
		
		bus1.openDoor();
		bus1.hoot();//버스 빵 빵 
		System.out.println("----------------------------(1)");
		car3.hoot();//로컬버스 빵빵 
		
		Car carP2 = new Truck();
		Truck truck1 = (Truck)carP2;
		Car carP3 = truck1;
		carP3.hoot();//트럭
		
		System.out.println("----------------------------(2)");
		
	
		Bus bus2 = new Bus(); //객체가 버스 
		Car lb = (Car)bus2;
		lb.hoot();
		
		
		
		System.out.println("끝");
		
		
		
	}//end of main
}

