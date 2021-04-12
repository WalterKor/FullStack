package Abstract;

public class DeskTop extends Computer{ //상속만을 하기위해만들어진 

	@Override
	public void display() {
		System.out.println("DeskTop display");
		
	}

	@Override
	public void typing() {
		System.out.println("DeskTop typing. ");
		
	}

	@Override
	public void turnOn() {
		System.out.println("DeskTop turnOn");
	}

	@Override
	public void turnOff() {
		System.out.println("DeskTop turnOff");
	}
	
	
	
	

}
