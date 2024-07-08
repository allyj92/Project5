package constructor;

public class Ex2 {
    public static void main(String[] args) {
        // 첫번째 생성자 메소드를 사용하여 인스턴스 생성
            Person person1 = new Person();
            person1.name = "둘리";
            person1.weight = 80;
            person1.height = 180;
         // 두번째 생성자를 사용하여 인스턴스 생성
            Person person2 = new Person("또치");
            person2.weight = 50;
            person2.height = 160;
         // 세번째 생성자를 사용하여 인스턴스 생성
            Person person3 = new Person("도우너",170,60);
         // 사용자 정의 생성자를 사용하면 값을 편하게 입력할 수 있다


    }
}

class Person{
    String name;
    int height;
    int weight;

    // 디폴트 생성자 직접 추가
    public Person(){

    }

    // 이름을 매개변수로 받아서 초기화하는 생성자
    public Person(String nm){
        name = nm;
    }

    // 이름, 키, 몸무게를 매개변수로 받아서 초기화하는 생성자
    public Person(String nm, int he, int we){
        this.name = nm;
        this.height = he;
        this.weight = we;
    }
}