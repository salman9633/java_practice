import java.util.Iterator;
import java.util.Scanner;

public class Array {
	
	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		
		System.out.println("ENTER THE SIZE OF THE ARRAY:");
		
		int limit=S.nextInt();
		
		System.out.println("ENTER THE ELEMENTS IN THE ARRAY:");
		
		int Arr[]=new int[limit];
		
		for(int i=0;i<limit;i++) {
			Arr[i]=S.nextInt();
		}
		System.out.println("ENTERED ARRAYS ARE:");

		for(int i=0;i<limit;i++) {
			
			System.out.println(Arr[i]);

			
		}
		
		
		
		
	}

}
