import java.util.Arrays;

public class insertionSorting {
	
	public static int[] insertionSort(int[] array) {
		
		for(int i=0;i<array.length-1;i++) {
			int current =array[i];
			int j= i-1;
			
			while(j>=0&&array[j]<current) {
				array[j+1]=array[j];
				j--;
			}
			array[j+1]=current;
		}
		
		return array;
	}
	
	public static void main(String[] args) {
		int[] array= {34,56,7,34,5,1,0,8,9};
		int[] result=insertionSort(array);
		
		Arrays.stream(result).forEach(x ->System.out.println(x));
	}

}
