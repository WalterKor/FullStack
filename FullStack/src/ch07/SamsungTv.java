package ch07;

public class SamsungTv implements RemoteControl{
	
	private int sound;
	
	public void cry() {
		System.out.println("CRY");
	}

	@Override
	public void volumeUp() {
		sound +=2;		
	}

	@Override
	public void volumeDown() {
		sound -=2;		
	}

	@Override
	public void volumeCheck() {
		System.out.println("sound : " + sound);
		
	}

}
