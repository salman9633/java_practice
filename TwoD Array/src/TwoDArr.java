import java.util.Scanner;

public class TwoDArr {
	
	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		
		System.out.println("ENTER THE SIZE OF THE ARRAY:");
		int limit1=S.nextInt();
		int limit2=S.nextInt();
		
		System.out.println("ENTER THE ELEMENTS:");
		
		int Arr[][]=new int [limit1][limit2];
		int i,j;
		for(i=0;i<limit1;i++) {
			for(j=0;j<limit2;j++) {
				Arr[i][j]=S.nextInt();
			}
			
		}
		for(i=0;i<limit1;i++) {
			for(j=0;j<limit2;j++) {
				System.out.print(Arr[i][j]);
				System.out.print("\t");
			}
			System.out.print("\n");
		}
		
		
		
	}

}
