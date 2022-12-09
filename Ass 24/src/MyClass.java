import java.util.Scanner;

public class MyClass extends Area {
	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		System.out.println("1 CIRCLE: \n2 SQUARE: \n3 RECTANGLE: \n4 TRIANGLE:");
		System.out.println("ENTER YOUR CHOICE:");
		int Choice=S.nextInt();
		Area A=new Area();
		
		
	
	switch (Choice) {
	case 1: 
		A.circle();
		break;
	
	case 2:
		A.square();
		break;
	case 3:
		A.rectangle();
		break;
	case 4:
		A.triangle();
		break;
	default:
		 System.out.println("Unexpected value ");
	
	
	

}
	}
}
