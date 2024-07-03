package method.quiz;

public class Quiz7 {
	public static void calc(int n1, int n2, char oper) {
//		switch (operator) {
//		case '+':
//			System.out.println(n1 + n2);
//			break;
//		case '-':
//			System.out.println(n1 - n2);
//			break;
//		case '*':
//			System.out.println(n1 * n2);
//			break;
//		case '/':
//			if (n2 != 0)
//				System.out.println(n1 / n2);
//			else
//				System.out.println("나눌 수 없음");
//			break;
//		}
		int result = 0;
		if(oper== '+') {
			result = n1 + n2;
		}else if(oper == '-') {
			result = n1 - n2;
		}else if(oper == '*') {
			result = n1 * n2;
		}else if(oper == '/') {
			result = n2!=0?n1 / n2:-999;
		}
		System.out.println(result);

	}

	public static void main(String[] args) {
		calc(3,5,'*');

	}

}
