package Chapter4.ch1;

class Book {
	private String title;
	private String author;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {

		return title + "," + author;
	}

}

public class BookTest {

	public static void main(String[] args) {

		Book book = new Book("데미안", "헤르만헤세");

		System.out.println(book); // Chapter4.ch1.Book@c46bcd4

		String str = new String("test");
		System.out.println(str);// test
		System.out.println(str.toString());// 오버라이딩

	}
}
