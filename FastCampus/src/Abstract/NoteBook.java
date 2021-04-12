package Abstract;

public abstract class NoteBook extends Computer{ //추상메서드 둘다 구현해놔야한다.

	@Override
	public void display() { //하나만 구현해놓으면 
		System.out.println("NoteBook display");
	}

	
}
