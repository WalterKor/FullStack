package ch07;

public class LGTv implements RemoteControl {

	private int volume = 0;
	@Override
	public void volumeUp() {
		volume++;
		
	}

	@Override
	public void volumeDown() {
		volume--;
		
	}

	@Override
	public void volumeCheck() {
		System.out.println("현재 볼륨 : " + volume);
		
	}

}
