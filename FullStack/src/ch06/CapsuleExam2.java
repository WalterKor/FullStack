package ch06;

public class CapsuleExam2 {
	public static void main(String[] args) {
		
		Human h1 = new Human();//�̸�: �̻�, ���� 10
		Human h2 = new Human("�򰭰���",20);//�̸�: �򰭰���, ���� 20
		Human h3 = new Human(30);//�̸�: �̻� , ���� 30 
		Human h4 = new Human("�̼���", 20);//�̸�: �̼���, ���� 20
		
		
		h1.whoAmI();
		h2.whoAmI();
		h3.whoAmI();
		h4.whoAmI();
		
	}//end of main

}//end of class
