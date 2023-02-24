package searching;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int[] a= {1,2,4,7,9,3};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		if(binSearch(a,3)!=-1) 
		    System.out.println("element is present at index "+binSearch(a,3));
		else
			System.out.println("element is not present in the array");
	}

	private static int binSearch(int[] a, int target) {
		int l=0;
		int h=a.length-1;
		int mid=(l+h)/2;
		
		while(!(l>h)) {
			mid=(l+h)/2;
			
			if(a[mid]==target) {
				return mid;
			}else if(target>a[mid]) {
				l=mid+1;
			}else 
				h=mid-1;
		}
		return -1;
	}

}
