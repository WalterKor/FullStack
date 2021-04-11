package ThisIsJava.Inheritance;

public class DmbCellPhone extends CellPhone{
	//필드
	int channel;
	
	//생성자
	DmbCellPhone(String model, String color, int channel){
		this.model = model;//CellPhone로부터 상속받은 필드
		this.color = color;
		this.channel = channel;
		
	}
	
	void turnOnDmb(){
		System.out.println("채널 : " + channel +"번 DMB방송 수신을 시작합니다.");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 : "+channel+"번으로 바꿉니다.");
	}
	
	void turnOffDmb() {
		System.out.println("DMB 방송을 수신을 멈춥니다.");
	}
	
}
