package ch15;

public class CustomerTest {
	
	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.buy();
		customer.sell();
		customer.order();
		customer.hello();
		
		Buy buyer = customer;//앞은 클래스가 아니라 인터페이슨데. 가능하네
							 //내가 생각하기론 업케스팅이 사용하는 메서드를 제한하기위해서 사용하는건가?
//		Buy buyer = new Buy(); //인스턴스는 객체화 하지 못한다. 
		System.out.println("-------------------------");
		customer.buy();//재정의된 메서드가 호출이 된다.
		buyer.buy();
		customer.order();
		buyer.order();
		System.out.println("-------------------------");
		Sell seller = customer;
		seller.order();
		seller.sell();

	}
}
