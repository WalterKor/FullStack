package Inheritance2;

public class DriveExample {
	public static void main(String[] args) {
		
		Driver driver = new Driver();//Driver클래스의 객체를 만든다. 
		
		Bus bus = new Bus();//Bus클래스의 객체를 만든다.
		Taxi taxi = new Taxi();//Taxi클래스의 객체를 만든다.
		
		driver.drive(bus);
		
		
	}//end of main

}//end of class
