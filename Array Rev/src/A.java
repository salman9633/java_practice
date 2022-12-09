import java.util.Iterator;
import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		
		System.out.println("limit:");
		int limit=S.nextInt();
		
		System.out.println("enter the limit:");
		int arr[]=new int[limit];
		
		for(int i=0;i<limit;i++) {
			arr[i]=S.nextInt();
			
			
		}
		System.out.println("ARRAY:");
		for(int i=0;i<limit;i++) {
			System.out.println(arr[i]);
		}
		
		B b=new B(arr.length,arr);
		
		
	}

}
