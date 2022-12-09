import java.util.Scanner;

public class IfSample {
	
	public static void main(String ar[]) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("ENTER A NUMBER:");
		
		int num=s.nextInt();
		
		if(num<0) {
			System.out.println("number is negative");
		}
		else if(num>0) {
			System.out.println("number is positive");
		}
		else {
			System.out.println("zero");
		}
	}

}
