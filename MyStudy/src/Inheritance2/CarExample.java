package Inheritance2;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i =1; i<=5; i++) { //Car객체의 run()메소드 5번 호출
			int problemLocation = car.run();
			
			switch (problemLocation) {
			case 1:
				System.out.println("앞 왼쪽 HanKookTire로 교체");
				car.forntLeftTire = new HanKookTire("앞 왼쪽", 15);
				break;
				
			case 2:
				System.out.println("앞 오른쪽 HanKookTire로 교체");
				car.forntLeftTire = new HanKookTire("앞 오른쪽", 15);
				break;
				
			case 3:
				System.out.println("뒤 왼쪽 HanKookTire로 교체");
				car.forntLeftTire = new HanKookTire("뒤 오른쪽", 15);
				break;
				
			case 4:
				System.out.println("뒤 오른쪽 HanKookTire로 교체");
				car.forntLeftTire = new HanKookTire("뒤 왼쪽", 15);
				break;
				
			default:
				break;
			}
			System.out.println("----------------------------------------");
		}
		
		
	}//end of main
}//end of class
