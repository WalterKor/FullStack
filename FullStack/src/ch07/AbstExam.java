package ch07;

public class AbstExam {

	public static void main(String[] args) {
		//Animal animal = new Animal(); 추상클래스는 객체화가 되지 않는다.
		Animal ani = new Cat();
		ani.breath();
		ani.howling();
	}
}
