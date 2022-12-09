import java.util.Scanner;

public class LinearSearch {
	
	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		System.out.println("ENTER THE LIMIT OF THE ARRAY:");
		int limit=S.nextInt();
		
		System.out.println("ENTER THE ELEMENTS IN THS ARRAY:");
		int Arr[]=new int[limit];
		int i;
		for( i=0;i<limit;i++) {
			Arr[i]=S.nextInt();	
		}
		/*for(int i=0;i<limit;i++) {
			System.out.println(Arr[i]);
		}*/
		System.out.println("ENTER THE ELEMENTS TO BE SEARCHED:");
		int Searchkey=S.nextInt();
		int flag=0;
		for(i=0;i<limit;i++) {
			if (Searchkey==Arr[i]) {
				flag=1;
				break;
				
				
			}
			
			
		}
		if (flag==1) {
			System.out.println("position at:"+(i+1));
			
		}else {
			System.out.println("element not found!!!!!!!");
		}
		
	}

}
