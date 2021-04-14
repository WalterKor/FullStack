package Chapter4.ch2;

public class Student implements Cloneable {

	private int studentNum;
	private String studentName;

	public Student(int studentNum, String studentName) {
		this.studentName = studentName;
		this.studentNum = studentNum;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String toString() {// 생성자로 정의된 값을 바로 출력하고싶을때
		return studentNum + "," + studentName;
	}
	/*
	 * @Override public int hashCode() { return studentNum; }
	 */

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student std = (Student) obj;
			if (this.studentNum == std.studentNum)// 값이 동일하면 true를 출력해라
				return true;
		} else {
			return false;
		}

		return false;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
