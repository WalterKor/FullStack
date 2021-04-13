package ch15;

public interface Queue {

	void enQueue(String title);
	String deQueue(); //책을 꺼낼때
	
	int getSize();
}
