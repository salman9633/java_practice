import java.util.Scanner;

public class CalcSwitch {
	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		
		System.out.println("num1:");
		double n1=S.nextDouble();
		
		System.out.println("num2:");
		double n2=S.nextDouble();
		
		System.out.println("choose the operator:");
		char oper=S.next().charAt(0);
		double res;
		switch (oper) {
		case '+':
			res=n1+n2;
			System.out.println(res);
			break;
		case '-':
			res=n1-n2;
			System.out.println(res);
			break;
		case '*':
			res=n1*n2;
			System.out.println(res);
			break;
		case '/':
			res=n1/n2;
			System.out.println(res);
			break;
		default:
			System.out.println("nota");
			break;
		}
		
		
		
		
	}

}
