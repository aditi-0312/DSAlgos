package recursion;

public class GCD {

	public static void main(String[] args) {
		int a=10;
		int b=3;
		int res = gcd(a,b);
		System.out.println(res);
	}

	private static int gcd(int a, int b) {
		if(b==0) {
			return a;
		}else {
			return gcd(b, a%b);
		}
		
	}

}
