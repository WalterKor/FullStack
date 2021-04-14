package ch07;

public class MyArrayList implements MyList {

	private int[] arr;// 전역변수는 static이기 때문에 값이 넣어져있다. null(참조변수)
						// 전역변수 원시타입 0

	public MyArrayList() { // 생성자
		arr = new int[0];
	}

	@Override
	public void add(int add) {
		int[] arr1 = new int[arr.length + 1];

		for (int i = 0; i < arr.length; i++) {
			arr1[i] = arr[i];
		}
		arr1[arr.length] = add;

		arr = arr1;
	}

	@Override
	public int remove() {
		int result = 0;
		if (arr.length > 0) {
			int[] arr1 = new int[arr.length - 1];

			for (int i = 0; i < arr1.length; i++) {
				arr1[i] = arr[i];
			}

			result = arr[arr.length - 1];
			arr = arr1;
			return result;
		} else {
			System.out.println("실핼 할 수 없습니다.");
			return 0;
		}
	}

	@Override
	public int size() {

		return arr.length;
	}

	@Override
	public int get(int i) {

		return arr[i];
	}

	@Override
	public void add(int idx, int add) {
		int temp[] = new int[arr.length + 1];

		for (int i = 0; i < temp.length; i++) {
			if (i < idx) {
				temp[i] = arr[i];
				continue;
			} else if (i == idx) {
				temp[i] = add;
			} else {
				temp[i] = arr[i - 1];
			}

		}
		arr = temp;

	}

	@Override
	public int remove(int idx) {//인덱스방을 제거

		int result = arr[idx];//그 인덱스의 값으 일시적으로 담는다.
		int[] temp = new int[arr.length - 1];//하나 작은 배열을 만든다.
		for (int i = 0; i < temp.length; i++) {

			if (i < idx) {
				temp[i] = arr[i];//그대로 담고
			} else {
				temp[i] = arr[i + 1];
			}

		}
		arr = temp;
		return result;
	}

}
