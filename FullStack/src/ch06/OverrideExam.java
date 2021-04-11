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
	
	NumBox(int num){//�����ڷ� �ʱ�ȭ
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}
	
	@Override
	public boolean equals(Object obj) { //n1�� n2�� ���� ==�ǹ̸� �ٲٴ� Ŭ���� 
		NumBox temp = (NumBox)obj;
		return this.getNum() == temp.getNum();
	}
}