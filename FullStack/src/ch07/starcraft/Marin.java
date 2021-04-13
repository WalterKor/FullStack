package ch07.starcraft;

public class Marin implements Bionic{
	private int currentHP = 10;
	private int MAX_HP = 20;
	
	/*currentHP에 대한 getter setter*/
	public int getCurrentHP() {
		return currentHP;
	}
	public void setCurrentHP(int currentHP) {
		this.currentHP = currentHP;
	}
	public int getMAX_HP() {
		return MAX_HP;
	}
	
	
}
