//package ch4.test;
//
//class Book{
//	String title;
//	String author;
//	int price;
//
//	public Book() {
//	}
//
//	public Book(String title, String author, int price) {
//		this.title = title;
//		this.author = author;
//		this.price = price;
//	}
//
//	public String getTitle() {
//		return title;
//	}
//
//	public void setTitle(String title) {
//		this.title = title;
//	}
//
//	public String getAuthor() {
//		return author;
//	}
//
//	public void setAuthor(String author) {
//		this.author = author;
//	}
//
//	public int getPrice() {
//		return price;
//	}
//
//	public void setPrice(int price) {
//		this.price = price;
//	}
//
//	@Override
//	public String toString() {
//		return title + "\t" + author + "\t" + price;
//	}
//}
//
//public class Ex04_19Array5 {
//	public static void main(String[] args) {
//
//		Book[] books = { new Book("Java 7", "에이콘", 2000),
//						 new Book("열혈강호", "양재현", 2500),
//						 new Book("무소유", "장혜민", 12000) };
//		
//		for(int i = 0; i < books.length; i++) {
//			Book book = books[i];
//			System.out.println(book.toString());
//		}
//	}
//}
