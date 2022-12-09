import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		System.out.println("ENTER THE LIMIT OF THE ARRAY:");
		int limit=S.nextInt();
		
		int A[][]=new int[limit][limit];
		ArrayP obj=new ArrayP();
		int[][] array=obj.getArray(limit, A);
		obj.displayArray(limit,array);
		
		
	}

}
