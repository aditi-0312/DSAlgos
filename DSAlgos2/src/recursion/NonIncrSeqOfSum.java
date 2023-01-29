package recursion;

public class NonIncrSeqOfSum {

	// Print all non-increasing sequences of sum equal to a given number x

	static int x = 3;

	public static int fn(int i, int x) {
		if (i > x) {
			return -1;

		} else {
			return i + fn(i + 1, x);
		}
	}

	public static void main(String[] args) {

		System.out.println(fn(0, x));
	}

}
