import java.util.Scanner;

public class ChoiceMath {
	
	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		System.out.println("ENTER TWO NUMBERS:");
		int num1=S.nextInt();
		int num2=S.nextInt();
		
		System.out.println(" 1 FOR ADD:\n 2 FOR SUM:\n 3 FOR MUL:\n 4 FOR DIV:");
		
		int choice=S.nextInt();
		double result=0;
		if(choice==1) {
			result=num1+num2;
		}else if (choice==2) {
			result=num1-num2;
			
		}else if (choice==3) {
			result=num1*num2;
			
		}else if(choice==4) {
			result=num1/num2;
			
		}else {
			System.out.println("NOTA");
		}
		
		System.out.println("result is:"+result);
		
				
		
	}

}
