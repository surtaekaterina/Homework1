
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 6;
		int b = 3;
		char operation = '/';
		int result = 0;

		if (operation=='+') {
			
			result = a+b;
		}
		
		else if (operation== '-'){
			result = a-b;
		}
		else if (operation == '*'){
			result = a*b;
		}
		else if (operation == '/'){
			result = a/b;
		}
		
		System.out.println("ответ " + result);
		
		/*switch (operation) {
		case '+':
			result = a + b;
			break;
		case '-':
			result = a - b;
			break;
		case '*':
			result = a * b;
			break;
		case '/':
			result = a / b;
			break;
		}
		
		System.out.println("ответ " + result);*/
	}
}