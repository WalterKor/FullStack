package ThisIsJava.Inheritance;

public class Student extends People{
	public int studentNo;
	
	Student(String name, String ssn, int studnetNo ){
		super(name, ssn);//���� �����ڿ�
		this.studentNo = studnetNo;//�߰��� ���
	}
}