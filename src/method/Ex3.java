package method;

public class Ex3 {
	// 숫자 1부터 10까지 출력하는 함수 선언
	public static void printTen() {
		
		for(int i = 1;i<=10;i++) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		printTen();
		printTen(); 
		printTen(); // 함수 호출
	}

}
