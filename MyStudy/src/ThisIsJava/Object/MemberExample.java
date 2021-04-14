package ThisIsJava.Object;

public class MemberExample {
	public static void main(String[] args) {
		
		//원본객체 생성
		Member original = new Member("j33515", "홍길동", "실바나스", 27, false);
	    //Member(String id,String name,String password,int age, boolean adult)
		
		//복제 객체를 얻은 후에 패스워드 변경
		Member cloned = original.getMember();
		cloned.password = "678980";
		
		System.out.println("[복제객체 필드값]");
		System.out.println("id : " + cloned.id);
		System.out.println("password : " + cloned.password);
		System.out.println("name : " + cloned.name);
		System.out.println("age : " + cloned.age);
		System.out.println("adult : " + cloned.adult);
			
		System.out.println();
		
		
	}

}
