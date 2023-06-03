public class JavaScope {

	public static void main(String[] args) {

// en cada for se declara i nuevamente
// y cada i solo es accesible dentro de su respectivo for

		for (int i = 0; i < 10; i++)
			System.out.print(i + " ");
		System.out.println();

		for (int i = 5; i < 10; i++)
			System.out.print(i * 2 + " ");
		System.out.println();

		for (int i = 3; i < 10; i++)
			System.out.print(i * 6 + " ");
		System.out.println();

		for (int i = 8; i < 10; i++)
			System.out.print(i * 7 + " ");
	}
}
