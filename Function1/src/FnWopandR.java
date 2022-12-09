import java.util.Scanner;

public class FnWopandR {
	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		
		System.out.println("enter two num:");
		int num1=S.nextInt();
		int num2=S.nextInt();
		
		sum(num1,num2);
		
	}

	private static void sum(int a, int b) {
		int result=a+b;
		System.out.println("result"+result);
		
	}

}
