package selfPractice.methodpractice;

public class Ex3 {
	static void checkAge(int age) {
		if (age < 18) {
			System.out.println("Access Denied");
		}else {
			System.out.println("Access");
		}
	}
	public static void main(String[] args) {
		checkAge(20);
	}

}
