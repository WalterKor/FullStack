package ch06;

public class ConstructorExam {
	//��ü���� ���� ��� �����ڸ� ����Ѵ�.
	//�����ڴ� ��ü�� ����� ���� ������ ȣ�� �ؾ��Ѵ�. 
	public static void main(String[] args) {
		
		Tv tv1 = new Tv();
		tv1.brand = "����";
		tv1.inch = 100;
		tv1.maxChannel = 100;
		tv1.maxVolume = 150;
		tv1.displayState();
		//���� 100inch 100Channel 150Volume
		
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
	
	Tv(){} //�⺻������
	
	Tv(String brand, int inch, int maxChannel, int maxVolume){//������
		this.brand =brand;
		this.inch = inch;
		this.maxChannel = maxChannel;
		this.maxVolume = maxVolume;			
	}
	
	void volumeUP() {
		currentVolume++;
	}
	
	void displayVolume() {
		System.out.println("���纼���� : "+ currentVolume);
	}
	
	void displayState() {
		System.out.printf("%s %dinch %dChannel %dVolume\n"
				, brand, inch, maxChannel, maxVolume);
	}
	
	/*
	 1. �⺻������
	 2. ������ VS �޼ҵ�
	 3. �̸��� Ŭ�������̶� ����.
	 4. ����Ÿ���� ����.
	 5. �����ڴ� ��ü ������ ���� ����� �� �ִ�.
	 6. �⺻�����ڴ� �����Ϸ��� �����ڰ� �ϳ��� ���� �ÿ� �־��ش�.	
	 */
	
	
	
	
	
	
	
	
	
	
	
	
}
