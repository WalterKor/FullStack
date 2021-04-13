package ch07.starcraft;

public class StarcarftMain {
	
	public static void main(String[] args) {
		
		Medic medic1 = new Medic();
		Medic medic2 = new Medic();
		Marin marin = new Marin();
		Tank tank = new Tank();
		 
		System.out.println("medic2 -hp:" + medic2.getCurrentHP());
		System.out.println("marin -hp:" + marin.getCurrentHP());
		
		System.out.println("치료 후");
		medic1.heal(medic2);
		medic1.heal(medic1);
		medic1.heal(marin);
		medic1.heal(tank);
		System.out.println("medic2 -hp:" + medic2.getCurrentHP());
		System.out.println("marin -hp:"+ marin.getCurrentHP());
	}

}
