package searching;

public class LinearSearch {

	public static void main (String[] args) {
		int[] arr= {1,2,3,4,5};
		
		System.out.println("given element is present at index " + linSearch(arr,2));
	}

	private static int linSearch(int[] arr, int x) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) 
			return i;
		}
		return -1;
	}
}
