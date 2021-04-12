package ch07;

public class Car {
		
	public void hoot() {
		System.out.println("빵 빵");
	}
}

class Bus extends Car{ //bus와 truck은 서로 상속관계가 아니다. 
	
	public void openDoor() {
		System.out.println("승객문을 열다.");
	}
	@Override
	public void hoot() {
		System.out.println("버스 빵 빵");
	}
	
}

class LocalBus extends Bus{//손자 이더라도 자식이다. 
	
}
class Truck extends Car{
	@Override
	public void hoot() {
		System.out.println("트럭 빵 빵");
	}
}