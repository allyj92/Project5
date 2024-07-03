package method.quiz;

public class Quiz4 {
	public static int minus(int a,int b) {
		if(a<b) {
			return -999;
		}
		int result = a-b;
		return result;
	}
	
	public static void main(String[] args) {
		int result = minus(20,10);
		System.out.println(result);
	}

}
