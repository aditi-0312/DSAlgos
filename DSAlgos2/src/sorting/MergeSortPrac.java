package sorting;

import java.util.Arrays;

public class MergeSortPrac {

	public static void main(String[] args) {
		int[] a = { 5, 1, 4, 2, 3 };

		sort(a);
		System.out.println(Arrays.toString(a));
	}

	private static void sort(int[] a) {
		if (a.length < 2) {
			return;
		}
		int mid = a.length / 2;
		int left[] = new int[mid];
		int right[] = new int[a.length - mid];

		for (int i = 0; i < mid; i++) {
			left[i] = a[i];
		}

		for (int i = mid; i < a.length; i++) {
			right[i - mid] = a[i];
		}

		sort(left);
		sort(right);

		merge(left, right, a);
	}

	private static void merge(int[] left, int[] right, int[] a) {
		int i = 0, j = 0, k = 0;

		while (i < left.length && j < right.length) {
			if (left[i] <= right[j]) {
				a[k++] = left[i++];
			} 
			else
				a[k++] = right[j++];
		}

		while (j < right.length) 
			a[k++] = right[j++];
		

		while (i < left.length)
			a[k++] = left[i++];
	
	}

}
