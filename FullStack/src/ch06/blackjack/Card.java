package ch06.blackjack;


public class Card {
	private String pattern;
	private String symbol;
	
	public Card(String pattern, String symbol) {
		this.pattern = pattern;
		this.symbol = symbol;		
	}

	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	
	@Override
	public String toString() {
		return String.format("%s (%s)", pattern ,symbol);
	}
	
}
