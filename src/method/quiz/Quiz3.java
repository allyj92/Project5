package method.quiz;

public class Quiz3 {

	public static int max(int a, int b) {
		if (a > b) {
			return a; // 값을 반환, 함수 종료
		} else {
			return b;
		}
	}

	public static void main(String[] args) {
		int result =max(5, 3);
		System.out.println(result);

	}

}
