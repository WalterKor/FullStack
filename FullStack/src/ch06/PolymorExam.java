package ch06;

public class PolymorExam {
	/*
	 1. �θ�Ÿ���� ������ �ڽİ�ü�� ����ų �� �ִ�.
	 2. �ڽ�Ÿ���� ������ �θ�ü�� ����ų �� ����.
	 3. Ÿ���� �ƴ� �޼ҵ常 ȣ���� �� �ִ�.
	 4. ȣ���� �Ǿ��ٸ� ������ ��ü�̴�.
	 */
	
	public static void main(String[] args) {
		
		Animal a1 = new Cat();
		Cat cat = (Cat)a1;
		Animal a2 = cat;
		
		
		a1.howling();
		cat.howling();
		cat.lick();
		
		System.out.println("��");
		
	}

}
