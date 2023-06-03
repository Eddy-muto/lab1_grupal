public class JavaMethods {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ingrese 2 numeros y el signo de la operacion que desea realizar: ");
		System.out.println(arithmethicOperation(sc.nextInt(), sc.nextInt(), sc.next().charAt(0)));
	}

	public static int arithmethicOperation(int num1, int num2, char operator) {
		if (operator == '+')
			return num1 + num2;
		else if (operator == '-')
			return num1 - num2;
		else if (operator == '*')
			return num1 * num2;
		else if (operator == '/')
			return num1 / num2;
		else
			return -1;
	}
}
