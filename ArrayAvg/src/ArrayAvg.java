import java.util.Scanner;

public class ArrayAvg {
	
	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		 System.out.println("ENTER THE SIZE OF THE ARRAY:");
		 int limit=S.nextInt();
		 
		 System.out.println("ENTER THE ELEMENTS IN THE ARRAY:");
		 int Array[]=new int[limit];
		 
		 for(int i=0;i<limit;i++) {
			 Array[i]=S.nextInt();
			 
		 }
		 System.out.println("ENTERED ARRAYS ARE:");
		 for(int i=0;i<limit;i++) {
			 System.out.println(Array[i]);
		 }
		 int sum=0;
		 for(int i=0;i<limit;i++) {
			 sum=sum+Array[i];
		 }
		 System.out.println("sum:"+sum);
		 
		 double Avg;
		 Avg=sum/limit;
		 System.out.println("Average:"+Avg);
		 System.out.format("The average is: %.2f", Avg);
		
	}
	
	
	

}
