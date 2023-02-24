package sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr= {7,4,8,3,6,2};
		int temp;
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=1;j<arr.length-i;j++) {
				
				//swap
				if(arr[j]<arr[j-1]) {
					temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					
					//swap
					
				}
			}
		}

		System.out.println(Arrays.toString(arr));
	}

}
