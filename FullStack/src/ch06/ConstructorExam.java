package ch06;

public class ConstructorExam {
	//객체지향 언어는 모두 생성자를 사용한다.
	//생성자는 객체가 만들어 질때 무조건 호출 해야한다. 
	public static void main(String[] args) {
		
		Tv tv1 = new Tv();
		tv1.brand = "샘성";
		tv1.inch = 100;
		tv1.maxChannel = 100;
		tv1.maxVolume = 150;
		tv1.displayState();
		//샘성 100inch 100Channel 150Volume
		
		Tv tv2 = new Tv("LG", 200, 150, 200);
		tv2.displayState();
		//LG 200inch 150Channel 200Volume

		
	}
}

class Tv{
	String brand;
	int inch;
	int maxChannel;
	int maxVolume;
	int currentChannel;
	int currentVolume;
	
	Tv(){} //기본생성자
	
	Tv(String brand, int inch, int maxChannel, int maxVolume){//생성자
		this.brand =brand;
		this.inch = inch;
		this.maxChannel = maxChannel;
		this.maxVolume = maxVolume;			
	}
	
	void volumeUP() {
		currentVolume++;
	}
	
	void displayVolume() {
		System.out.println("현재볼륨은 : "+ currentVolume);
	}
	
	void displayState() {
		System.out.printf("%s %dinch %dChannel %dVolume\n"
				, brand, inch, maxChannel, maxVolume);
	}
	
	/*
	 1. 기본생성자
	 2. 생성자 VS 메소드
	 3. 이름은 클래스명이랑 같다.
	 4. 리턴타입이 없다.
	 5. 생성자는 객체 생설할 때만 사용할 수 있다.
	 6. 기본생성자는 컴파일러가 생성자가 하나도 없을 시에 넣어준다.	
	 */
	
	
	
	
	
	
	
	
	
	
	
	
}
