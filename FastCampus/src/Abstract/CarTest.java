package Abstract;

public class CarTest {
	public static void main(String[] args) {
		
		System.out.println("AI_CAR");
		Car aiCar = new AICar();
		aiCar.run();
		System.out.println("------------------------------------");
	
		
		System.out.println("MANUAL_CAR");
		Car mCar = new ManualCar();
		mCar.run();
	}//end of main

}//end of class
