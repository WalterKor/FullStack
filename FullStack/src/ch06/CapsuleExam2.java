package ch06;

public class CapsuleExam2 {
	public static void main(String[] args) {
		
		Human h1 = new Human();//이름: 미상, 나이 10
		Human h2 = new Human("평강공주",20);//이름: 평강공주, 나이 20
		Human h3 = new Human(30);//이름: 미상 , 나이 30 
		Human h4 = new Human("이순신", 20);//이름: 이순신, 나이 20
		
		
		h1.whoAmI();
		h2.whoAmI();
		h3.whoAmI();
		h4.whoAmI();
		
	}//end of main

}//end of class
