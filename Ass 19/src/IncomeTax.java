import java.util.Scanner;

public class IncomeTax {
	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		System.out.println("ENTER THE ANNUAL INCOOME OF THE PERSONE=");
		double income=S.nextDouble();
		double tax;
		if(income<=250000) {
			System.out.println("Income tax amount ="+0);
		}else if(income>250000&&income<=500000) {
			tax=((income/100)*5);
			System.out.println("Income tax amount ="+tax);
		}else if(income>500000&&income<=1000000) {
			tax=((income/100)*20);
			System.out.println("Income tax amount ="+tax);
		}else if(income>1000000&&income<=5000000) {
			tax=((income/100)*50);
			System.out.println("Income tax amount ="+tax);
		}
	}

}
