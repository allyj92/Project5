package method.quiz;

public class Quiz5 {
	public static void devide(int a, int b) {

		if (b == 0) {
			System.out.println("나누는 수는 0이될 수 없습니다.");
			return;
		}
		int result = a / b;
		System.out.println(result);
	}

	public static void main(String[] args) {
		devide(6, 2);

	}

}
