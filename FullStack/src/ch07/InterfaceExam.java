package ch07;

public class InterfaceExam {
	public static void main(String[] args) {
		
		LGTv tv1 = new LGTv();
		RemoteControl rc = tv1;
		RemoteControl rc2 = new SamsungTv();
		SamsungTv rc3 = new SamsungTv();
		//타입에 관계없이 객체에 오버라이딩된 메서드를 호출한다. 
		
		rc.volumeUp();//같은 객체를 가르키므로
		rc.volumeCheck();
		
		tv1.volumeUp();
		rc.volumeUp();
		tv1.volumeCheck();
		
		rc2.volumeUp();
		rc2.volumeCheck();
		rc2.volumeDown();
		rc2.volumeCheck();
		//rc2.cry(); 사용이 불가능하다.
		  rc3.cry();
		  
		  
		  
	}
}
