import java.util.Scanner;

public class ArrayProb {
	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		System.out.println("ENTER THE LIMIT OF AN ARRAY:");
		int limit=S.nextInt();
		int Arr[]=new int[limit];
		int b[]=new int[limit-1];
		System.out.println("ENTER THE ELEMENTS IN THS AARAY:");
		for(int i=0;i<limit;i++) {
			Arr[i]=S.nextInt();
		}
		System.out.println("OUTPUT:");
		for(int i=0;i<limit-1;i++) {
			b[i]=Arr[i]*Arr[i+1];
			System.out.print(b[i]+"\t");
		}
	}

}
