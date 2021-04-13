package ch07.starcraft;

import java.lang.management.OperatingSystemMXBean;

public class Medic implements Bionic{
	private int currentHP=3;
	private int MAX_HP = 15;
	
	public int getCurrentHP() {
		return currentHP;
	}
	public void setCurrentHP(int currentHP) {
		this.currentHP = currentHP;
	}
	
	public void heal(Object unit) {
		
		if(this == unit || (unit instanceof Bionic)) {
				System.out.println("치료할 수 없습니다.");
				return;
		}
				
				if(unit instanceof Marin) {
				Marin marin = (Marin)unit;
				marin. etCurrentHP(marin.getMAX_HP());
			}else if(unit instanceof Medic){				
				Medic medic = (Medic)unit;
				medic.setCurrentHP(medic.MAX_HP);
			}
			
		}//end of heal();
		
		
	}
	
	
	

