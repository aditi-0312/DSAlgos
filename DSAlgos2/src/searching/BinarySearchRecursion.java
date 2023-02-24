package searching;

public class BinarySearchRecursion {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int l=0;
		int h=a.length-1;
		System.out.println(binSearchRecursion(a,l,h,4));
	}

	private static int binSearchRecursion(int[] a, int l, int h, int target) {
		if(l>h) {
			return -1;
		}
		else 
		{
		int mid=(l+h)/2;
		
		if(a[mid]==target) {
			return mid;
			
		}else if(target<a[mid]) {
			return binSearchRecursion(a,l,h=mid-1,target);
		}else
			return binSearchRecursion(a,l=mid+1,h,target);
		}
	}

}
