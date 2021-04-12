package Abstract;

public abstract class Car {
	
	public abstract void drive();//추상메서드 1
	public abstract void stop();//추상메서드 2
	public abstract void wiper();//추상메서드 3
	
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	public void washCar() {} //추상메서드가 아니라 구현된 메서드이다.
	
	final public void run() {
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
		washCar();
	}
	
}
