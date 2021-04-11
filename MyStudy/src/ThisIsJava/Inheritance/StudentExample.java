package ThisIsJava.Inheritance;

public class StudentExample {
	public static void main(String[] args) { //함수는 메인에서 작동한다.
		
		Student student = new Student("홍길동", "7496-0002", 1);
		System.out.println("name : "+student.name);
		System.out.println("ssn : "+student.ssn);
		System.out.println("studentNo : " +student.studentNo);
	}//end of main
}//end of class
