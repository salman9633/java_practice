//fn with arg & ret val

package functionsample;

import java.util.Scanner;

public class FnSample {
	public static void main(String a[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 num:");
		
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		int result=sum(num1,num2);
		System.out.println("result:"+result);
		
		
		
	}

	static int sum(int a,int b) {
		int s=a+b;
		return s;
	}
	
}
