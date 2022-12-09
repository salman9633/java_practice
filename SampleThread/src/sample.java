
public class sample {
	
	public static void main(String[] args) {
		
		SampleThread st=new SampleThread();
		
		st.start();
		
		SampleThread st1=new SampleThread();
		st1.start();
	}

}
