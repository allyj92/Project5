package reference;

public class Quiz1 {
    public static void main(String[] args) {
        // 회원이 대여한 책 3권 추가
        Book book1 = new Book("나미야 잡화점",14220,"누리출판사",380);
        Book book2 = new Book("아몬드",18000,"별곰자리 출판사",580);
        Book book3 = new Book("기억전달자",12000,"별곰자리",430);
        // 회원 생성
        Member member = new Member(1,"임은재",book1,book2,book3);



    }
}

class Member{
    int id;
    String name;
    Book book1;
    Book book2;
    Book book3;

    public Member(int id, String name, Book book1, Book book2, Book book3) {
        this.id = id;
        this.name = name;
        this.book1 = book1;
        this.book2 = book2;
        this.book3 = book3;
    }
}

class Book{
    String title;
    int price;
    String publisher;
    int page;

    public Book(String title, int price, String publisher, int page) {
        this.title = title;
        this.price = price;
        this.publisher = publisher;
        this.page = page;
    }
}
