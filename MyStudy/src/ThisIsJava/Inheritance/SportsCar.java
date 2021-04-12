package ThisIsJava.Inheritance;

public class SportsCar extends Car{

	@Override
	public void speedUp() {//오버라이딩이 가능하나 final로 지정한 메서드는 상속이 불가능하다.
		// TODO Auto-generated method stub
		super.speedUp();
	}

}
/*
 	1.final 키워드는 클래스,필드,메서드 선언시 사용이 가능하다.
 	2. 해당선언이 최종상태이고 결코 수정될 수 없을을 뜻하낟.
 	3
 */
