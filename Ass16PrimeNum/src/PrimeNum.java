import java.util.Scanner;

public class PrimeNum {
	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER:");
		int n=S.nextInt();
		if(n%2==0) {
			System.out.println("it is not a prime number");
		}else {
			System.out.println("it is a prime number");
		}
		
	}

}
