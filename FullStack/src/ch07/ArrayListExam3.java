package ch07;

import java.util.List;
import java.util.ArrayList;

public class ArrayListExam3 {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList();
		
		//wapper Class
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println("for");
		for(int i=0; i<list.size(); i++) { //size() 크기를 리턴해준다.
			System.out.printf("%d : %d \n", i, list.get(i));
		}
		
		System.out.println("for_each");
		for(int num : list) {
			System.out.println(num);
		}
		
		
		
		
	}//end of main
}//end of class
