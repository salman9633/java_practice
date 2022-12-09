
public class B extends A {
	B(){
		int mul=1;
		for(int i=1;i<=3;i++) {
			mul=mul*i;
			
		}System.out.println(mul);
		
		
	}

	public static void main(String[] args) {
		B obj=new B();//parent class operation will get the priority and it will execute first
	}
}
