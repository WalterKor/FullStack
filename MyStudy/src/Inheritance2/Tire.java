package Inheritance2;

public class Tire {
	//필드
	public int maxRotation;
	public int accumulatedRotation;
	public String location;
	
	//생성자
	public Tire(String location, int maxRotation) { //바퀴의 위치, 바퀴의 최대회전수 생성하면서 초기화
		this.location = location;//바퀴위치 
		this.maxRotation = maxRotation;
	}
	
	//메소드
	public boolean roll() {
		
		++accumulatedRotation; //누적회전수 1증가
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "Tire 수명 : "+(maxRotation-accumulatedRotation)+"회");
			return true; //타이어 수명이 남아있으면 true
		}else {
			System.out.println("***"+location+"Tire 펑크***");
			return false;//타이어 수명이 남아 있지 않으면 flase
		}
	}
}