import java.util.Scanner;

public class GradeCalc {
	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		System.out.println("MARK IN WRITTEN EXAM=");
		double Written=S.nextDouble();
		System.out.println("MARK IN LAB EXAM=");
		double Lab=S.nextDouble();
		System.out.println("MARK IN ASSIGNMENTS=");
		double Ass=S.nextDouble();
		
		double Grade=((Written*70)/100)+((Lab*20)/100)+((Ass*10)/100);
		System.out.println("GRADE OF STUDENT="+Grade);
	}

}
