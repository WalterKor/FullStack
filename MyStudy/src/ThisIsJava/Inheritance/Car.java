package ThisIsJava.Inheritance;

public class Car {
	//필드
	public int speed;
	
	//메서드
	public void speedUp() {
		speed++;
	}
	
	public	final void stop() {
		System.out.println("차를 멈춥니다.");
		speed = 0;
	}
	

}
