import java.util.Scanner;

public class PositionFinder {
		public static void main(String[] args) {
			Scanner S=new Scanner(System.in);
			
			System.out.println("ENTER THE STRING:");
			String str=S.nextLine();
			
			System.out.println("enter the position :");
			int pos=S.nextInt()-1;
			
			char a=str.charAt(pos);
			System.out.println("ans:"+a);
			
		}

	


}
