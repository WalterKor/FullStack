package ch06;

public class AccessExam {

	public static void main(String[] args) {
		
		Access acc = new Access();
		acc.setNum(15);
		acc.printNum();
		
		
		
		
	}
}

class Access{
	private int num; //�����̺����� ����ȭ �Ǿ��ִ� ������ �����ϱ� ���ؼ��� setter, getter�Լ��� ���ؼ� �����Ѵ�.
	
	void printNum() {
		System.out.println("num : " + num);
	
	}

	public int getNum() {//������ ���� ���� �����´�.
		return num;
	}

	public void setNum(int num) {//���������Ѵ�.
		this.num = num;
	}

}
