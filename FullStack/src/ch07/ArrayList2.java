package ch07;

import java.util.ArrayList;
import java.util.Arrays;

import Chapter4.ch2.Student;

public class ArrayList2 {
	public static void main(String[] args) {
//		ArrayList list = new ArrayList();//타입 미설정 Object로 선언된다.
//		ArrayList<Student> members = new ArrayList<Student>();//타입설정 Student객체만 사용가능
		ArrayList<Integer> num = new ArrayList<Integer>();//타입설정 int타입만 사용가능
//		ArrayList<Integer> num2 = new ArrayList<>();//new에서 타입 파라미터 생략가능
//		ArrayList<Integer> num3 = new ArrayList<Integer>(10);//초기 용량(capacity)지정
//		ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1,2,3));//생성시 값추가
		
		num.add(10);
		num.add(10);
		num.add(10);
		
		System.out.println(num.get(0));//0번째 index 출력
		
		for(Integer i : num) { //for문을 통한 전체출력
		    System.out.println(i);
		}
		
		
		
		
	}
}
