import java.util.Scanner;

public class StarPattern {
	public static void main(String[] args) {
		//Scanner S=new Scanner(System.in);
		//System.out.println("enter the limit:");
		//int limit=S.nextInt();
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=2*i;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
			for(int k=1;k<=3*i;k++) {
				if(i>=3) {
					break;
				}
				System.out.println("*");
				
			}
			
		}
		
		
	}

}
