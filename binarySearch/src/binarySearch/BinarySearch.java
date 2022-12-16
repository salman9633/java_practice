package binarySearch;

public class BinarySearch {

	public static int binarySearch(int[] array,int target) {
	int start=0;
	int end=array.length-1;
	
	while(start<=end) {
		int middle=start+(end-start)/2;
		if(array[middle]==target) {
			return middle;
		}else if(array[middle]>target) {
			end=middle-1;

		}else if(array[middle]<target) {
			start=middle+1;
			
		}
	}
	return -1;
	}
	
	public static void main(String[] args) {
		int[] array= {1,2,3,4,5,5,6};
//		System.out.println(array);
//		int op=;
		System.out.println(binarySearch(array, 5));
	}
}
