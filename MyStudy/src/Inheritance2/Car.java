package Inheritance2;

public class Car {
	//필드
	Tire forntLeftTire = new Tire("앞 왼쪽",6);
	Tire forntRightTire = new Tire("앞 오른쪽",2);
	Tire backLeftTire = new Tire("뒤 왼쪽",3);
	Tire backtLeftTire = new Tire("뒤 오른쪽",4);
	
	//메소드
	int run() {
		System.out.println("자동차가 달립니다.");
		if(forntLeftTire.roll() == false) {stop(); return 1;}
		if(forntRightTire.roll() == false) {stop(); return 2;}
		if(backLeftTire.roll() == false) {stop(); return 3;}
		if(backtLeftTire.roll() == false) {stop(); return 4;}
		return 0;
	}
	
	void stop() {
		System.out.println("자동차가 멈춥니다. ");
	}
}
