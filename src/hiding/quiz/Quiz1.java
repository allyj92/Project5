package hiding.quiz;

public class Quiz1 {

	public static void main(String[] args) {
		Book book1 = new Book();
		Book book2 = new Book();

		book1.setTitle("자바프로그래밍");
		book1.setPrice(20000);
		book1.setPublish("한빛컴퍼니");
		book1.setPage(300);
		System.out.println(book1.getTitle() +" " + book1.getPrice()
		+" "+ book1.getPublish() + " " + book1.getPage());
		
		book1.setTitle("자바프로그래밍");
		book1.setPrice(20000);
		book1.setPublish("한빛컴퍼니");
		book1.setPage(300);
		System.out.println(book1.getTitle() +" " + book1.getPrice()
		+" "+ book1.getPublish() + " " + book1.getPage());

	}

}

class Book{
	private String title;
	private int price;
	private String publsh;
	private int page;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPublish() {
		return publsh;
	}
	public void setPublish(String publsh) {
		this.publsh = publsh;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	
	
}
