package recursion;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		System.out.print("enter no. = ");
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		rev(n);
	}

	private static int rev(int n) {
		if (n <= 10) {
			System.out.print(n);
			return n;
		} else {
			System.out.print(n % 10);
			return rev(n / 10);
		}

	}

}
