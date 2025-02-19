package instance.quiz;

import java.util.Date;

public class Quiz2 {
    //  다음과 같이 주문클래스(Order)를 정의하세요.
//  주문번호, 주문날짜, 주문자이름, 배송지를 속성으로 갖습니다.
//  모든 주문 정보를 출력하는 showOrderInfo 함수를 갖습니다.
//
//  그리고 Order 클래스를 사용하여 다음 정보를 가지는 인스턴스를 생성하세요.
//  주문번호: 1111
//  주문날짜: 2018년3월12일
//  주문자이름: 둘리
//  배송지: 서울시 영등포구 여의도동 20번지
    public static void main(String[] args) {
        Order order = new Order();
        order.number = 1111;
        order.date= "2018년3월12일";
        order.customerName = "둘리";
        order.adrress="서울시 영등포구 여의도동 20번지";

        order.showOrderInfo();
    }

}

class Order{
    int number;
    String date;
    String customerName;
    String adrress;

    public void showOrderInfo(){
        System.out.println("주문번호 : " + number + "주문날짜 : " + date + "주문자 이름 : " + customerName + "배송지 : " + adrress);
    }
}
