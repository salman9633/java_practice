import java.util.Arrays;
public class selectionSort {

	public static int[] selectionSort(int[] array) {
		for(int i=0;i<array.length-1;i++) {
			int index=i;
			
			for(int j=i+1;j<array.length;j++) {
				if(array[j]<array[index]) {
					index=j;
				}
			}
			int smallest=array[index];
			array[index]=array[i];
			array[i]=smallest;
		}
		return array;
	}
		
	public static void main(String[] args) {
		int[] arr= {3,7,1,9,2};
		int[] sortedArr=selectionSort(arr);
		Arrays.stream(sortedArr).forEach(elem -> System.out.println(elem));
		
		
		
	
}
}
