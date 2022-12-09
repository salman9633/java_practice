import java.util.Scanner;

public class TriangleArea {
	public static void main(String[] args) {
		
		Scanner M=new Scanner(System.in);
		
		System.out.println("ENTER THE THREE SIDES OF THE TRIANGLE:");
		double a=M.nextDouble();
		double b=M.nextDouble();
		double c=M.nextDouble();
		
		SemiPeri S=new SemiPeri();
		Area A=new Area();
		
		double sem=S.SemiPerimtr(a,b,c);
		A.Area(sem, a, b, c);
		
	
	}

}
