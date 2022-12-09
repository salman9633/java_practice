import java.awt.im.InputSubset;
import java.util.Scanner;

public class MiniCalc {
	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		System.out.println("ENTER TWO NUMBERS");
		double n1=S.nextDouble();
		double n2=S.nextDouble();
		System.out.println("1:SUBSTRACTION: \n2:ADDITION: \n3:MULTIPLICATION \n4:DIVISION:");
		System.out.println("ENTER YOUR CHOICE :");
		int choice=S.nextInt();
		Function f=new Function();
		
		if(choice==1) {
			     f.sub(n1,n2);
			
		}
		else if(choice==2) {
		       f.add(n1,n2);	
		}
		else if(choice==3) {
		       f.mul(n1,n2);

		}else if(choice==4) {
		       f.div(n1,n2);

		}else {
			System.out.println("INVALID");
		}
		
		
	}
	




	

}
