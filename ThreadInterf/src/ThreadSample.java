
//USING SECOND METHOD(RUNNABLE INTERFACE)
public class ThreadSample implements Runnable{

	
	public void run() {

		for(int i=0;i<10;i++) {
			
			System.out.println("Thread:"+i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	

}
