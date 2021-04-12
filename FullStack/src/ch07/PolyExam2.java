package ch07;

public class PolyExam2 {
	//instanceof는 상속 관계일때 사용하는 기능
	
	//Bus bus = new Truck();
	public static void main(String[] args) {
		Car car1 = new LocalBus(); //Car메서드만 사용가능 
		
		System.out.println(car1 instanceof LocalBus);
		
		LocalBus lb1 = (LocalBus)car1;//자기타입으로 변환가능
		
		System.out.println(car1 instanceof Bus);
		System.out.println("---------------------------");
		
		Car car2 = new Bus();
		//LocalBus lb2 = (LocalBus)car2; 런타임 에러가 뜬다.	
		System.out.println(car2 instanceof LocalBus);
		
		System.out.println("---------------------------");
		
		Car car3 = new Truck();
		//Bus bus3 = (Bus)car3;//런타임 에러
		Truck truck = new Truck();
		//Bus bus4 = (Bus)truck; 에초에 에러뜬다.
		System.out.println(car3 instanceof Bus);//false
		
		
		
	}
	
}
