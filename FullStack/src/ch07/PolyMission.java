package ch07;

public class PolyMission {
	
	public static void main(String[] args) {
		
		Car car1 = new Car();
		Car car2 = new Bus();
		Car car3 = new LocalBus();
		Car car4 = new Truck();
		
		
		//Bus와 LocalBus객체였다면 openDoor 메소드 호출
		
		blowKlaxon(car1);//hoot 객체화를 하지 않고 사용한다. 
		blowKlaxon(car2);//openDoor
		blowKlaxon(car3);//openDoor
		blowKlaxon(car4);//hoot
		
		
	}

	private static void blowKlaxon(Car car4) {
		
		if( car4 instanceof Bus ) {
			((Bus) car4).openDoor();
		}else {
			car4.hoot();
		}
			
	}
		
	
}
