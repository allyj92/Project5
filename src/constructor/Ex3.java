package constructor;
/*
 * 생성자 generate 기능 사용하기
 * */
public class Ex3 {

}

class Board{
    int no;
    String title;
    String content;
    String writer;

    public Board(int no, String title, String content, String writer) {
        this.no = no;
        this.title = title;
        this.content = content;
        this.writer = writer;
    }
}

