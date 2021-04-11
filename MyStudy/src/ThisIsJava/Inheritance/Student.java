package ThisIsJava.Inheritance;

public class Student extends People{
	public int studentNo;
	
	Student(String name, String ssn, int studnetNo ){
		super(name, ssn);//이전 생성자에
		this.studentNo = studnetNo;//추가한 경우
	}
}