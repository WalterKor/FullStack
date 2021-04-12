package Inheritance2;

public class ChildExample {
	public static void main(String[] args) {
		
		Parent parent = new Child(); // Child객체에 타입 사용할 수 있는 메서드
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		//parent.method3(); 사용불가능
		
		
	}
}
