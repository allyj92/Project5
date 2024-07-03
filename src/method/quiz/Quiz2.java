package method.quiz;

public class Quiz2 {

	public static int add(int a, int b) {
		int sum = 0;
		for (int i=a; i<=b; i++) {
			sum +=i;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(add(5,10));
		
	}

}
