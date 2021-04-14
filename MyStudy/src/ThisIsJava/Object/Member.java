package ThisIsJava.Object;

public class Member implements Cloneable{
	/*멤버필드 선언*/
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;

	Member(String id,String name,String password,int age, boolean adult) {/*생성자 생성*/
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}

	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member)clone();
		}catch (CloneNotSupportedException e) {
			return cloned;
		}
		return cloned;
	}
	
	
	@Override // 재정의
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		
		return id.hashCode();
	}
	
	
}
