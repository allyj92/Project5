package hiding;

<<<<<<< HEAD

public class Ex1 {
    public static void main(String[] args) {
//        MyDate11 date = new MyDate11();
//        date.month = 2;
//        date.day = 31;
//        System.out.println("현재 날짜 : " + date.month + "월 " + date.day +"일");
    }
}
//public class MyDate11{
//	public int month; // 월
//	public int day; // 일
//}
=======
/*
 * public 변수 선언하고 값 변경하기
 * */

public class Ex1 {
    public static void main(String[] args) {
        MyDate date = new MyDate();
        date.month = 2;
        date.day = 31;
        System.out.println("현재 날짜는 " + date.month + "월 " + date.day +"일 입니다");

        // public변수는 잘못된 값이 저장되는 것을 막을 수 없음
    }
}

class MyDate{
    public int month;
    public int day;
}
>>>>>>> 274d59513f6f91b5a88434510e490f38d6986127
