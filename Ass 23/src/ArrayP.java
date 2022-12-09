import java.util.Scanner;

public class ArrayP {
	int [][] getArray(int limit,int a[][]) {
		Scanner A=new Scanner(System.in);
		System.out.println("ENTER THE VALUES OF ARRAY:");
		for(int i=0;i<limit;i++) {//scanning the values of array
			for(int j=0;j<limit;j++) { 
					 a[i][j]=A.nextInt();
			}
		}
		return a;
	}
	void displayArray(int limit,int Arr[][]) {
		System.out.println("ENTERED ARRAYS ARE:");
		for(int i=0;i<limit;i++) {//array printing
			for(int j=0;j<limit;j++) {
					System.out.print(Arr[i][j]+"\t");
				
			}
			System.out.println("\n");
		}
		
	}
	
	

}
