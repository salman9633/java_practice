package stack;

public class stack {
	static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			
		}
	}
	public Node top;
	
	public void push(int data) {
		Node newNode= new Node(data);
		if(top==null) {
			top=newNode;
		}else {
			newNode.next=top;
			top=newNode;
		}
	}
	
	public void pop() {
		if(top==null) {//stack-under flow
			System.err.println("err");
			return;
		}
		
		top = top.next;
	}
	
	public void display() {
		Node current= top;
		
		while (current!=null) {
			System.out.print(current.data + " ");
			current=current.next;
		}
	}
	
	
	public static void main(String[] args) {
		stack stack=new stack(); 
		
		stack.push(1);
		stack.push(3);
		stack.push(5);
		
		stack.pop();
		stack.display();
	}
}
