package recursion;

public class Recursion_1 {

	static int[] arr = { 12, 5, 5, 10, 8 };

	public static void main(String[] args) {

		int result = sumOfDigits(arr.length - 1);
		System.out.println(result);

		int fact_value = Fact(5);
		System.out.println(fact_value);

		int fib_value = fibonacciNum(6);
		System.out.println(fib_value);
	}

	private static int fibonacciNum(int n) {
		if (n == 0 || n == 1) {
			return n;
		} else
			return fibonacciNum(n - 1) + fibonacciNum(n - 2);
	}

	private static int Fact(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * Fact(n - 1);
		}
	}

	private static int sumOfDigits(int n) {

		if (n == 0)
			return arr[n];

		return arr[n] + sumOfDigits(n - 1);

	}

}
