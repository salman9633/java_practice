
public class TextScanner {
	Abstract1 obj;
	
	public TextScanner(Abstract1 obj) {
		
		
		this.obj=obj;
		
		

	}
	
	void scan() {
		
		String text="scanned text";
		obj.onText(text);
	}
	

}
