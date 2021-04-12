package Abstract;
//이탤릭체 추상메서드 추상 클래스 
public abstract class Computer {//추상클래스 안에 추상메서드를 구현가능하다. 
	
	public abstract void display(); //추상메서드
	public abstract void typing();	 //추상메서드
	
	public void turnOn() {//공통으로 사용할 메서드는 구현해놓는다. 
		System.out.println("전원을 킵니다.");
	}
	
	public void turnOff() {//공통으로 사용할 메서드는 구현
		System.out.println("전원을 끕니다.");
	}
	
	
}
