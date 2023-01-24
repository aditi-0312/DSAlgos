package recursion;

public class PowerOfNum {

	public static void main(String[] args) {
		int n = 9;
		int p = 3;
		int res = powOfN(n, p);
		System.out.println(res);

	}

	private static int powOfN(int n, int p) {
		if (p == 0) {
			return 1;
		} else {
			return n * powOfN(n, p - 1);
		}

	}

}
