package bubbleSorting;

import java.util.Arrays;

public class bubbleSort {
	
	public static void main(String[] args) {
		int[] arr= {99,5,6,3,55,77,8};
		int[] result=bubbleSort(arr);
		Arrays.stream(result).forEach(elem -> System.out.println(elem));
		
	}
	public static int[] bubbleSort(int[] arr) {
		int temp;
		int n=arr.length;
		for (int i=0;i<n;i++) {
			for(int j=1;j<(n-i);j++) {
				if(arr[j-1]>arr[j]) {
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		return arr;
	}

}
