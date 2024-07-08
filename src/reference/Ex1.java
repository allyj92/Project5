package reference;



/*
 * 학생의 시험점수를 저장하는 프로그램 만들기
 * */
public class Ex1 {
    public static void main(String[] args) {
        Subject math = new Subject("수학",80); // 수학 과목
        Subject korean = new Subject("국어",100);
        Student student = new Student(1001,"둘리",math,korean);
    }
}

//성적을 저장하는 클래스 만들기
class Subject {
    String subjectName;
    int scorePoint;

    // 모든정보를 입력받는 생성자 generate
    public Subject(String subjectName, int scorePoint) {
        this.subjectName = subjectName;
        this.scorePoint = scorePoint;
    }
}

/*
 * 학생 클래스 만들고 시험성적 저장하기
 * */

class Student{
    int studentID;
    String studentName;
    Subject math;
    Subject korean;

    public Student(int studentID, String studentName, Subject math, Subject korean) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.math = math;
        this.korean = korean;
    }
}