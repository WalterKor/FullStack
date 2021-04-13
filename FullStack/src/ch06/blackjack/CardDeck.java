package ch06.blackjack;



public class CardDeck {
	public static final String[] CARD_PATTERNS = {"Spades", "Hearts", "Diamonds", "Clubs"};
	public static final String[] CARD_SYMBOLS = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
	
	private final int EACH_CARD_LEN = 13;	
	private final Card[] CARD_ARR;
	
	public CardDeck() {
		CARD_ARR = new Card[CARD_PATTERNS.length * EACH_CARD_LEN];
		System.out.println(CARD_PATTERNS.length);		
		init2();
	}
	
	private void init2() {
		int idx = 0;
		for(String pattern : CARD_PATTERNS) {			
			for(String symbol : CARD_SYMBOLS) {				
				CARD_ARR[idx++] = new Card(pattern, symbol);
			}
		}
	}
	
	private void init() {
		int idx = 0;
		for(int i=0; i<CARD_PATTERNS.length; i++) {
			for(int z=1; z<=EACH_CARD_LEN; z++) {
				String symbol = null;
				switch(z) {
				case 1: symbol = "A"; break;
				case 11: symbol = "J"; break;
				case 12: symbol = "Q"; break;
				case 13: symbol = "K"; break;
				//default: symbol = Integer.toString(z);					
				default: symbol = String.valueOf(z);
				//default: symbol = z + "";
				}
				CARD_ARR[idx++] = new Card(CARD_PATTERNS[i], symbol);
				//CARD_ARR[(i * EACH_CARD_LEN) + (z-1)] = new Card(CARD_PATTERNS[i], symbol);
			}
		}		
	}
	
	/*
	 내가한답
	public Card getoneCard() {//타입이 Card
		int Number;
		
		label :
		while(true) {//카드를 랜덤하게 준다. 뽑힌카드는 null로 만들어야한다.
			Number = (int)(Math.random()*52);
			if(CARD_ARR[Number] == null) {
				continue label;
			}else {				
				break label;
			}
		}
		Card c = CARD_ARR[Number];
		CARD_ARR[Number] = null;
		return c;
	}
	*/
	private int getRandomIdx() {
		return(int)(Math.random()*CARD_ARR.length);
	}
	
	public Card getoneCard() {
		
		Card c = null;
		int idx = 0;
		do {
			idx = getRandomIdx();
			c = CARD_ARR[idx];
		}while(c == null);
		
		CARD_ARR[idx] = null;
		
		return c;
		
	}
	/*
	 //내가한 답 
	public void printAll() {
		for(int i=0; i<CARD_ARR.length; i++) {
			System.out.println(String.format("CARD_ARR[%d] : %s",i, CARD_ARR[i])); //배열값은 서식문자로 %s를 사용한다.
		}
	}
	*/
	
	
	
	public void printAll() {
		for(Card c : CARD_ARR) {
			System.out.println(c);
		}
	}
	
	
}


