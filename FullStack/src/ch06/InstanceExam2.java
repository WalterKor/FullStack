package ch06;

public class InstanceExam2 {

	public static void main(String[] args) {		
		Dog d1 = new Dog();
		Dog d2 = d1;
		
		d1.name = "����";
		d2.name = "�ǻ�";
		d2.name = "����";
		
		d2.bark();
		d1.bark();
	}

}
