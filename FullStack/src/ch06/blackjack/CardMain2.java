package ch06.blackjack;

public class CardMain2 {//메인함수
	public static void main(String[] args) {
		new CardDeck();
		
		CardDeck cd = new CardDeck();
		for(int i=0;i<52;i++)
		{
			Card card1=cd.getoneCard();
			System.out.println(card1);
		}
//		Card card2 = new Card("",""); 객체로 들어가야한다. 
	}
}
