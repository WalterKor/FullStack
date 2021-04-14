package ch07;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMission {
	public static void main(String[] args) {

		MyList list = new MyArrayList();
		ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1, 2, 3));

		/* <추가하는 메서드> */
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);

		//list.add(2, 30);
		//list.remove(2);
		
		int delVal = list.remove(2);
		System.out.println("delVal : " + delVal);
		/* <List로 해보는거> */
		/*
		 * System.out.println(list2.get(0)); System.out.println(list2.get(1));
		 * System.out.println(list2.get(2));
		 */
		/*
		 * int val = list.remove(); System.out.println(val);
		 */

		for (int i = 0; i < list.size(); i++) { // size() 크기를 리턴해준다.
			System.out.printf("%d : %d \n", i, list.get(i));

		}
		/*
		 * ArrayList list = new ArrayList();//타입 미설정 Object로 선언된다. ArrayList<Student>
		 * members = new ArrayList<Student>();//타입설정 Student객체만 사용가능 ArrayList<Integer>
		 * num = new ArrayList<Integer>();//타입설정 int타입만 사용가능 ArrayList<Integer> num2 =
		 * new ArrayList<>();//new에서 타입 파라미터 생략가능 ArrayList<Integer> num3 = new
		 * ArrayList<Integer>(10);//초기 용량(capacity)지정 ArrayList<Integer> list2 = new
		 * ArrayList<Integer>(Arrays.asList(1,2,3));//생성시 값추가
		 */

	}
}
