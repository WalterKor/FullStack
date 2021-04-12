package Inheritance2;
//Tire의 자식클래스
public class HanKookTire extends Tire{
	//필드
	//생성자
	public HanKookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
	
		++accumulatedRotation; //누적회전수 1증가
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "HanKookTire 수명 : "+(maxRotation-accumulatedRotation)+"회");
			return true; //타이어 수명이 남아있으면 true
		}else {
			System.out.println("***"+location+"HanKookTire 펑크***");
			return false;//타이어 수명이 남아 있지 않으면 flase
		}
	
	}
	
	//메소드
	
}
