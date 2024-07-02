package method.quiz;

public class Quiz1 {
	

	public static void calcultor(int num1, int num2) {
		int add = num1 + num2;
		int minus = num1 - num2;
		int multiply = num1 * num2;
		int devide = num1 / num2;
		
		System.out.println("Add : " + add + " minus : " + minus + " multiply : " + multiply + " devide : " + devide);
	}

	public static void main(String[] args) {
		calcultor(5,2);
		calcultor(10,4);

	}

}
