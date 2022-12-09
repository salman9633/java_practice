package staticsample;

public class Static {
	
	int a=10;
	static int b=30;//in static the memory in static
	public static void main(String a[]) {
		Static h=new Static();
		Static h1=new Static();
		
		System.out.println(h.a);
		System.out.println(h.b);
		
		
		h.a=120;
		h.b=3000;
		h1.b=40;//in static fn the last value will print
		
		System.out.println("h.a:"+h.a);
		System.out.println("h.b:"+h.b);
		
		}
	

}
