import java.util.Scanner;

public class Limit {
	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		System.out.println("ENTER THE LIMIT OF THE ARRAY:");
		int limit=S.nextInt();
		int Arr1[][]=new int[limit][limit];
		int Arr2[][]=new int[limit][limit];
		Function g=new Function();//obj to class fn
		g.getArray(limit, Arr1, Arr2);
		int[][] a=g.addArray(limit, Arr1, Arr2);
		g.displayArray(limit,a );
		
	}

}
