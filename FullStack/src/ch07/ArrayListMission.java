package ch07;

public class ArrayListMission {
	public static void main(String[] args) {
		
		MyList list = new MyArrayList();
		
		list.add(10);		
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println("for");
		for(int i=0; i<list.size(); i++) { //size() 크기를 리턴해준다.
			System.out.printf("%d : %d \n", i, list.get(i));
		}
		
	
		
		
		
	}
}
