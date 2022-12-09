
public class Sample {
	public static void main(String[] args) {
		
		ThreadSample st=new ThreadSample();
		Thread t=new Thread(st);
		t.start();
		
		ThreadSample st1=new ThreadSample();
		Thread t1=new Thread(st1);
		t1.start();
		
		
	}

}

