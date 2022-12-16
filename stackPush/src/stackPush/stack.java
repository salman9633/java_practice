package stackPush;

public class stack {
	
	node top;
	public void push(int data) {
		Node newNode= new Node(data);
		
		if(top==null) {
			top=newNode;
			return;
		}else {
			newNode.next=top;
			top=newNode;
		}
		
	}

}

int start=0;
int end=array.length-1;

while(start<=end) {
	int middle= start+(end-start)/2;
	
	if(array[middle]==target) {
		return middle;
	}else if(array[middle]>target) {
		end=middle-1;
	}else if(array[middle]<target) {
		start=middle+1;
	}else {
		
	}
}
