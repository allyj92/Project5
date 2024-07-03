package method.quiz;

public class Quiz8 {
	public static int sumOfDigit(int num) {
		int hundred = num/100;
		int tens = (num%100)/10;
		int ones = (num%100)%10;
		
		System.out.println(hundred +" " +tens+ " " +ones );
		return hundred + tens + ones;
		
	}
	
	public static void main(String[] args) {
		int result = sumOfDigit(932);
		System.out.println(result);
	}

}
