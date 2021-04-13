package ch07;

public interface RemoteControl {
	/*
	 인터페이스에서 생성된것들은 
	 1. 무조건 선언부만 가진다.
	 2. 변수를 상수로 취급하게된다 자동적으로 public final을 자동적으로 붙힌다.
	 3. 
	 <추상클래스>
	 객체화 불가능 부모 타입 역활만한다. 
	 부모타임역활 
	 자식한테 추상메소드 오버라이딩
	 자식한테 강제성 부여한다. 
	 다중상속 X
	 변수 가질 수 있음
	 상수 가질 수 있음
	 구현부 있는 메소드를 가질 수 있다.
	 추상 메소드를 가질 수 있다.
	 
	 <인터페이스>
	 객체화 불가능하다.
	 부모타입 역활
	 자식한테 추상메소드 오버라이딩
	 자식한테 강제성 부여한다. 
	 다중상속 O
	 변수 가질 수 없음
	 무조건 상수로 가짐
	 구현부 있는 메소드를 가질수 없다
	 추상 메소드를 가질 수 없다.
	 
	 private 무조건 같은 클래스 비밀
	 default 
	 protected 패키지
	 public 무조건 오픈
	 */
	/*(public static final)생략*/int age = 10;
	
		/*(public abstract)생략*/void volumeUp(); //어디 어디에서나 접근하기 쉬운 
		public abstract void volumeDown();
		public void volumeCheck();
		
}
