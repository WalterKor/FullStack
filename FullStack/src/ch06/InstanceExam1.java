package ch06;

public class InstanceExam1 {
	public static void main(String[] args) {
		
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		
		d1.name = "�ǻ�";
		d2.name = "����";
		
		d1.bark();
		d2.bark();
		
	}

}

//����ʵ�(���� ������ �� �ִ� ��)-�����
//����޼ҵ�(���� ������ �� �ִ� ��)- ������

class Dog{
	String name;
	String specific;
	int age;
	
	void bark() {
		System.out.printf("%s�� �۸�\n",name);
	}
}