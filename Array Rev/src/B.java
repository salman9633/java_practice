
public class B {

	B(int length, int a[]) {
		int b[]=new int[length];
		
		int temp=length;
		for(int i=0;i<length;i++) {
			b[temp-1]=a[i];
			temp--;
		}
		System.out.println("rev:");
		for(int i=0;i<length;i++) {
			System.out.println(b[i]);
		}
	}

}
