package ch07;

public  abstract class Animal {//추상클래스 안에 추상메서드가 존재한다. 
	private int age;
	private String name;
	
	public abstract void howling(); //메소드의 선언부만 있고 구현부가 없는 메서드를 
						   			//추상메서드라고 한다.
	public void breath() {System.out.println("숨쉰다.");}
	/*
	  1. 추상클래스는 객체화가 되지 않는다. 객체화가 되는걸 막기위해 
	  2. 추상메서드는 무조건 오버라이딩해야한다.  
	 */
	
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}
	
	
}//end of class

class  Cat extends Animal{ //Cat클래스 자체도 추상클래스가되면 굳이 오버라이딩하지 않아도 된다. 

	@Override //무조건 오버라이딩해야한다.
	public void howling() {
		System.out.println("야옹~ 야옹 ");
	}
		
}

class Dog extends Animal{

	@Override
	public void howling() {
		System.out.println("바우 바우");
		
	}
	
}
