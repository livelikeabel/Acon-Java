package ch4.test;

class Book {
	private String title;
	private String author;
	int price;

	public Book() {}
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String toString() {
		return title + "\t" + author + "\t" + price; 
	}
}

public class Ex04_16Array2{
	public static void main(String[] args) {
		Book[] books = new Book[3];
		
		books[0] = new Book("Java 7", "������", 20000);
		books[1] = new Book("������ȣ", "������", 2500);
		books[2] = new Book("������", "������", 12000);
		
		for(int i = 0; i < books.length; i++) {
			Book book = books[i];
			System.out.println(book.toString());
		}
	}
	
}
