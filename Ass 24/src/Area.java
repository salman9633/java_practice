import java.util.Scanner;

public class Area {
	Scanner line=new Scanner(System.in);
	void circle(){
		System.out.println("ENTER THE RADIUS OF THE CIRCLE:");
		double radius=line.nextDouble();
		double area=3.14*radius*radius;
		System.out.println("AREA OF THE CIRCLE IS:"+area);			
	}
	void square() {
		System.out.println("ENTER THE VALUE OF A SIDE:");
		double side=line.nextDouble();
		double area=side*side;
		System.out.println("AREA OF THE SQUARE IS:"+area);
	}
	void rectangle() {
		System.out.println("ENTER THE BREADTH OF THE RECTANGLE:");
		double breadth=line.nextDouble();
		System.out.println("ENTER THE LENGTH OF THE RECTANGLE:");
		double length=line.nextDouble();		
		double area=length*breadth;
		System.out.println("AREA OF THE RECTANGLE IS:"+area);
	}
	void triangle() {
		System.out.println("ENTER THE BASE OF THE TRIANGLE:");
		double base=line.nextDouble();
		System.out.println("ENTER THE HEIGHT OF THE TRIANLE:");
		double height=line.nextDouble();		
		double area=(base*height)/2;
		System.out.println("AREA OF THE RECTANGLE IS:"+area);
		
	}

}
