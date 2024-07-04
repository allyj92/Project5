package instance;
/*
 * 학생 클래스
 * */
public class Student {
    int studentId; // 학번
    String studentName; // 이름
    int grade; // 학년
    String address; // 주소

    // 학생의 모든 정보를 보여주는 함수 선언
    public void showStudntInfo(){
        System.out.println("학번 : " + studentId + "이름 : " + studentName + "학년 : " + grade + "주소 : "+address );
    }
}
