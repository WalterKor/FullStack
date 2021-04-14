package ch8;

import java.util.ArrayList;

class Animal {

	public void move() {
		System.out.println("������ �����Դϴ�.");
	}

	public void eating() {

	}
}

class Human extends Animal {

	@Override
	public void move() {
		System.out.println("����� �ι߷� �Ƚ��ϴ�.");
	}

	public void readBook() {
		System.out.println("����� å�� �н��ϴ�.");
	}

}

class Tiger extends Animal {

	@Override
	public void move() {
		System.out.println("ȣ���̰� �׹߷� �ݴϴ�.");
	}

	public void hunting() {
		System.out.println("ȣ���̰� ����� �մϴ�.");
	}

}

class Eagle extends Animal {
	public void move() {
		System.out.println("�������� �ϴ��� ���� �ٴմϴ�.");
	}

	public void flying() {
		System.out.println("�������� �糯���� ��� ���ƴٴմϴ�.");
	}
}

public class AnimalTest {
	public static void main(String[] args) {

		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();

		AnimalTest test = new AnimalTest();
		test.moveAnimal(hAnimal);
		test.moveAnimal(tAnimal);
		test.moveAnimal(eAnimal);

		ArrayList<Animal> animallList = new ArrayList<>();
		animallList.add(hAnimal);
		animallList.add(tAnimal);
		animallList.add(eAnimal);

		for (Animal animal : animallList) {
			animal.move();
		}

		test.testDownCasting(animallList);

	}// end of main

	public void testDownCasting(ArrayList<Animal> list) {

		for (int i = 0; i < list.size(); i++) {
			Animal animal = list.get(i);

			if (animal instanceof Human) {

				Human human = (Human) animal;
				human.readBook();
			} else if (animal instanceof Tiger) {

				Tiger tiger = (Tiger) animal;
				tiger.hunting();
			} else if (animal instanceof Eagle) {

				Eagle eagle = (Eagle) animal;
				eagle.flying();
			} else {
				System.out.println("unsupported type");
			}
		}

	}

	public void moveAnimal(Animal animal) {
		animal.move();
	}
}// end of class
