package ch06.blackjack;

public class CardMain2 {//메인함수
	public static void main(String[] args) {
		new CardDeck();
		
		CardDeck cd = new CardDeck();
		
			Card card1=cd.getoneCard();
			System.out.println(card1);
			
			Card card2=cd.getoneCard();
			System.out.println(card2);
			
			System.out.println("-----------------------");
		
//		Card card2 = new Card("",""); 객체로 들어가야한다. 
		
		cd.printAll();
		
		
	}
}
