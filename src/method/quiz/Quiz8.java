package method.quiz;

public class Quiz8 {
	public static void sumOfDigit(int num) {
		int sum = 0; // 합계
		// 1의 자리
		sum += (num%10);
		// 10의 자리
		num /=10;
		sum+=num%10;
		// 100의 자리
		num/=10;
		sum += num;
		
		System.out.println(sum);
		
//		int hundred = num/100;
//		int tens = (num%100)/10;
//		int ones = (num%100)%10;
//		
//		System.out.println(hundred +" " +tens+ " " +ones );
//		return hundred + tens + ones;
		
	}
	
	public static void main(String[] args) {
		sumOfDigit(932);
	}

}
