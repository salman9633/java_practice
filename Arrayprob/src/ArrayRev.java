import java.util.Scanner;

public class ArrayRev {
	
	static void Rev(int a[],int n) {
		int[] b=new int[n];
		int j=n;
		
		for(int i=0;i<n;i++) {
			b[j-1]=a[i];
			j=j-1;	
			
		}
		System.out.println("reversed Array:");
		
		for(int k=0;k<n;k++) {
			System.out.println(b[k]);
		}
		
}

	
	

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
	
	Rev(Arr,Arr.length);
	
	
}

}

