package ch06.blackjack;

public class CardMain {
	public static void main(String[] args) {
		
		Card c1 = new Card("spade", "K");
		System.out.println(c1);//원래는 주소값이다. 
		
		Card c2 = new Card("heart", "2");
		System.out.println(c2); 
		
		Card c3 = new Card("club", "3");
		System.out.println(c3);
		
	}//end of main
	
	public static void println(String str) {
		System.out.println(str);
	}
	
	public static void println(Object obj) {
		System.out.println("Obj!!");
		String str = obj.toString();
		println(str);
	}
}//end of class

