package recursion;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int key = 4;
		int low = 0;
		int high = arr.length - 1;
		int res = binSearch(arr, key, low, high);
		System.out.println(res);
	}

	private static int binSearch(int[] arr, int key, int low, int high) {
		if (low > high) {
			System.out.println("key not found");
			return -1;
		}
		int mid = (low + high) / 2;
		if (key == arr[mid]) {
			return mid;
		} else if (key < arr[mid]) {
			return binSearch(arr, key, low, mid - 1);
		} else
			return binSearch(arr, key, mid + 1, high);

	}

}
