public class JavaMethodsOverloading {

	public static void main(String[] args) {
		System.out.println(RectangularArea(10, 4));
		System.out.println(RectangularArea(5));
		System.out.println(RectangularArea());

	}

	public static int RectangularArea(int x, int y) {
		return x * y;
	}

	public static int RectangularArea(int x) {
		return x * x;
	}

	public static int RectangularArea() {
		return 1;

	}
}
