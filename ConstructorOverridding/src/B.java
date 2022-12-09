
public class B extends A{
	
	B(){
		int a=100;
		System.out.println(a);
		
	}
	B(int b){
		super(10);
		int k=b+10;
		System.out.println(k);
		
	}
public static void main(String[] args) {
	
	B o=new B();
	
}
}
