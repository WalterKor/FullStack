package Chapter4.ch2;

public class EqualsTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student std1 = new Student(100, "Lee");
		Student std2 = new Student(100, "Lee");
		Student std3 = std1;
		
		System.out.println("std1 == std2 : "+(std1 == std2)); //참조변수의 값이 다르기 떄문에 
		System.out.println("std1.equals(std3) : "+ std1.equals(std3));//오버라이딩해서 재정의해서 다른 함수이다.
		
		System.out.println("std1.hashCode() : "+std1.hashCode());
		System.out.println("std2.hashCode() : "+std2.hashCode());
		
		System.out.println();
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println("str1.hashCode() : "+ str1.hashCode());
		System.out.println("str2.hashCode() : "+ str2.hashCode());
		System.out.println("str1.equals(str2) : " + str1.equals(str2));
		
		Integer i = 100;
		System.out.println(i.hashCode());
		
		System.out.println(System.identityHashCode(std1)); //진짜 주소값을 출력해주는 함수 
		System.out.println(System.identityHashCode(std2)); //진짜 주소값을 출력해주는 함수 
		
		std1.setStudentName("Kim");
		Student copyStudent = (Student)std1.clone();//타입은 Object이다.
		System.out.println(copyStudent.toString());
		
	}//end of main
}//end of class
