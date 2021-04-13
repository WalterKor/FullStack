package ch07;

public class MyArrayList implements MyList{

	private int[] arr;
	
	public MyArrayList() { //생성자 
		arr = new int[0];
	}
	
	@Override
	public void add(int add) {
	  int[] arr1 = new int[arr.length+1]; 	
		
		for(int i=0; i<arr.length; i++) {
			arr1[i]= arr[i];
		}
		arr1[arr.length] = add;
		
		arr = arr1;
	}

	@Override
	public int size() {
		
		return arr.length;
	}

	@Override
	public int get(int i) {
	
		return arr[i];
	}

}
