package ch06;

public class CapsuleExam {
	public static void main(String[] args) {
		Human h1 = new Human();
		Human h2 = new Human();
		//h1 나이는 12, 이름은 "홍길동"
		//h2 나이는 20, 이름은 "신사임당"
		
		h1.setAge(12); h1.setName("홍길동");
		h2.setAge(20); h2.setName("신사임당");
		
		h1.whoAmI();
		h2.whoAmI();
	}

}

class Human{
	private int age;
	private String name;
	
	Human(){
		this(10);
	}
	
	Human(int age){
		this("미상", age);
	}
	
	
	Human(String name){
		this(name,10);
	}
	
	Human(String name, int age){
		this.name= name;
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void whoAmI() {
		System.out.printf("제 이름은 %s이고 제 나이는 %d입니다.\n",name,age);
	}
	
	
	
	
}