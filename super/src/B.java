
public class B extends A {
	int a;
	B(){
		System.out.println("B constr");
	}
	B(int a){
		super(10);
		System.out.println("arg B constr");
	}
	void display() {
		System.out.println("it's B");
		super.display();
		a=20;
		super.a=30;
		int c=a+super.a;
		
		System.out.println(c);
		
		
	}
	void bsedisplay() {
		super.display();
	}
	public static void main(String[] args) {
		B b=new B(10);
		
		
		//b.display();
	}

}
