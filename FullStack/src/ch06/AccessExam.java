package ch06;

public class AccessExam {

	public static void main(String[] args) {
		
		Access acc = new Access();
		acc.setNum(15);
		acc.printNum();
		
		
		
		
	}
}

class Access{
	private int num; //프라이빗으로 은닉화 되어있는 변수를 접근하기 위해서는 setter, getter함수를 통해서 접근한다.
	
	void printNum() {
		System.out.println("num : " + num);
	
	}

	public int getNum() {//셋팅한 값을 도로 가져온다.
		return num;
	}

	public void setNum(int num) {//값을셋팅한다.
		this.num = num;
	}

}
