package ThisIsJava.Inheritance;

public class SuperSonicAirplane extends Airplane{
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;

	
	public int flyMode = NORMAL;
	
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행을 합니다.");
		}else {
			//Airplane 객체의 fly() 메소드호출
			super.fly();
		}
	}
	
}
