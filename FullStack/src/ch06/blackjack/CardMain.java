package ch06.blackjack;

public class CardMain {
	public static void main(String[] args) {
		
		Card c1 = new Card("spade", "K");
		System.out.println(c1);//������ �ּҰ��̴�. 
		
		Card c2 = new Card("heart", "2");
		System.out.println(c2); 
		
		Card c3 = new Card("club", "3");
		System.out.println(c3);
		
	}//end of main
	
	public static void println(String str) {// 주소값을 그대로 출력하도록 오버라이딩
		System.out.println(str);
	}
	
	public static void println(Object obj) {
	
		String str = obj.toString();
		println(str);
	}
}//end of class

