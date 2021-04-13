package ch07;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListExam {
	public static void main(String[] args) {
		
		List list = new ArrayList();//배열이랑 비슷한데 유동적으로 크기가 변한다.
//		List list2 = new LinkedList();//수정이 잦을때 이걸 사용한다. 
		
		list.add(9);
		list.add(10);
		list.add(10.1);
		list.add("ddd");
		
		System.out.println("list.get(0) : "+list.get(0));
		System.out.println("list.get(1) : "+list.get(1));
		System.out.println("list.get(2) : "+list.get(2));
		//list.get(idx)
		
		int val2 = (int)list.get(0);
		System.out.println("Val2 : " +val2);
		
		
		Object obj = list.get(1);
		double val = (double)obj;
		System.out.println("val : " + val);
		
	}//end
	
}//end of class
class Box{
	int val;
	Box nextBox;
	
}