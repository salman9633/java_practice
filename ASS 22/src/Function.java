import java.util.Scanner;

public class Function {
	void getArray(int limit,int A[][],int b[][]) {
		System.out.println("ENTER THE ELEMENTS IN THE FIRST ARRAY:");
		Scanner o=new Scanner(System.in);
		for(int i=0;i<limit;i++) {//first array
			for(int j=0;j<limit;j++) {
				A[i][j]=o.nextInt();
			}			
		}System.out.println("ENTER THE ELEMNTS IN THE SECOND ARRAY:");
			for(int i=0;i<limit;i++) {//second array
			for(int j=0;j<limit;j++) {
				b[i][j]=o.nextInt();
			}	
		}
	}	
	int[][] addArray(int limit,int A[][], int B[][]) {
		int sum[][]=new int[limit][limit];
		for(int i=0;i<limit;i++) {
			for(int j=0;j<limit;j++) {
				sum[i][j]=A[i][j]+B[i][j];//sum of two array
			}
		}
		return sum;
	}	
	void displayArray(int size,int a[][]) {
		System.out.println("SUM OF TWO ARRAYS=");
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				System.out.println(a[i][j]);
			}			
		}
	}
}
