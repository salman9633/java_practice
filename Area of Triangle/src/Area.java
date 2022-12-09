
public class Area {
	void Area(double s,double a,double b,double c) {
		double l=s*(s-a)*(s-b)*(s-c);
		double A=Math.sqrt(l);
		
		System.out.println(A);
		return;
	}

}