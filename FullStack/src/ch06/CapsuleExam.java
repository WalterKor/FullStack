package ch06;

public class CapsuleExam {
	public static void main(String[] args) {
		Human h1 = new Human();
		Human h2 = new Human();
		//h1 ���̴� 12, �̸��� "ȫ�浿"
		//h2 ���̴� 20, �̸��� "�Ż��Ӵ�"
		
		h1.setAge(12); h1.setName("ȫ�浿");
		h2.setAge(20); h2.setName("�Ż��Ӵ�");
		
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
		this("�̻�", age);
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
		System.out.printf("�� �̸��� %s�̰� �� ���̴� %d�Դϴ�.\n",name,age);
	}
	
	
	
	
}