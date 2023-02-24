package searching;

public class JumpSearch {

	public static void main(String[] args) {
		int[] a = { 1, 4, 7, 9, 12, 14, 17, 19, 21, 25,76};

		System.out.println("element is present at index " +jumpSearch(a, 76));
	}

	private static int jumpSearch(int[] a, int target) {
		int jump=(int) Math.sqrt(a.length);
		//System.out.println(jump);
		
		int start=0;
		int last=jump-1;
		while(last<a.length && start<a.length) {
			if(target<=a[last]) {
				//linear search
				for(int i =start;i<=last;i++) {
					if(target==a[i]) 
						return i;
				}
			}
				else {
					start=last+1;
					last=last+jump;
					if(last>a.length-1)
						last=a.length-1;
				}
			}
		return -1;
		}
	}