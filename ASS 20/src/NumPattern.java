import java.util.Scanner;

public class NumPattern {
	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		
		System.out.println("ENTER THE LIMIT=");
		int limit=S.nextInt();
		int temp=1;
		for(int i=1;i<=limit;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(temp+"\t");
				temp++;
				
			}
			System.out.print("\n");
		}
	}

}
