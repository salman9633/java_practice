package methodoverridding;

public class B extends A{
	void sum() {
		int sum=44;
		System.out.println(sum);
		super.sum();//to call parent class
	}
	public static void main(String[] args) {
		
		
		B ob=new B();
		ob.sum();//same nameil different classil methods vechal call aakumbol sub class mathrame execute avukayullu
		           //parent classine venam enkil super keyword use aakanam
	}

}
