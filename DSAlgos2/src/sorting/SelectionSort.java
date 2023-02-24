package sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] a= {6,4,5,9,2,3};
		int temp;
		
		for(int i=0;i<a.length;i++) {
			
			int minIndex=i;
			
			for(int j=i;j<a.length;j++) {
				//swap
				if(a[j]<a[minIndex]) {
					temp=a[minIndex];
					a[minIndex]=a[j];
					a[j]=temp;
					//swap
				}
			}
		}
		
		System.out.println(Arrays.toString(a));
	}

}
