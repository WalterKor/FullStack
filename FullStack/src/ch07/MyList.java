package ch07;

public interface MyList {

	public abstract void add(int add);
	public abstract int remove();
	public abstract int remove(int idx);
	public abstract void add(int idx, int add);
	int size();
	int get(int i);

}
