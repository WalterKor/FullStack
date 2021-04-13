package ch15;

public class Customer implements Buy, Sell{ //디폴트 메서드가 중복이되어 오류가 뜬다.

	@Override
	public void buy() {
		System.out.println("customer buy");
		
	}

	@Override
	public void sell() {
		System.out.println("customer sell");
	}

	@Override
	public void order() {
		System.out.println("customer order");
	}
	
	public void hello() {
		System.out.println("hello");
	}
	
	

}
