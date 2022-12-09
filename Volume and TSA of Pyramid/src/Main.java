import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		System.out.println("ENTER THE HEIGHT OF THE PYRAMID:");
		double height=in.nextDouble();
		
		System.out.println("ENTER THE BASE VALUE OF THE SQUARE PYRAMID:");
		double base=in.nextDouble();
		
		System.out.println("ENTER THE OPERATION YOU WANT:");
		int choise=in.nextInt();
		
		
		
		BaseASlanHe BA=new BaseASlanHe();
		Volume V=new Volume();
		Area A=new Area();
		
		double bas=BA.basearea(base);
		double slh=BA.slandheight(height, base);
		
		//A.area(slh, base, bas);
		//V.volume(bas, height);
		
		if (choise==1) {
			A.area(slh, base, bas);
			
		}
		else if (choise==2) {
			V.volume(bas, height);
			
		}
		else {
			System.out.println("NOTA");
		}
		
	}

}
