package ch06;

public class OverloadingExam {
	public static void main(String[] args) {
		
		//Calc ��üȭ
		//sum�޼ҵ� ȣ�� �ƱԸ����� 5, 10
		Calc c = new Calc();
		
		c.sum(5, 10);// ����� 15
		c.sum(5, 10, 11);//����� 26
		c.sum(10,20, "30");//����� 3030
		
	}//end of main

}//end of class


class Calc{
	
	void sum(int n1, int n2) {
		System.out.println(n1 + n2);
	}
	
	void sum(int n1, int n2, int n3) {
		System.out.println(n1+n2+n3);
	}
	
	int sum(int d1, int d2, String d3) {
		System.out.println(d1+d2+d3);
		return 0;
	}
}