package ch06;

public class OverrideExam {
	public static void main(String[] args) {
		
		NumBox n1 = new NumBox(10);
		NumBox n2 = new NumBox(10);
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println("n1==n2 : "+(n1==n2));
		System.out.println("n1.equals(n2) : "+n1.equals(n2));
		
		
		
		
	}//end of main

}//end of class

class NumBox{
	private int num;
	
	NumBox(int num){//생성자로 초기화
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}
	
	@Override
	public boolean equals(Object obj) { //n1과 n2에 대해 ==의미를 바꾸는 클래스 
		NumBox temp = (NumBox)obj;
		return this.getNum() == temp.getNum();
	}
}