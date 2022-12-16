

public class Queue {

	static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
		}
	}
	
	public Node front;
	public Node rear;
	
	public void enqueue(int data) {
		Node newNode= new Node(data);
		
		if(front==null) {
			front=rear=newNode;
			return;
		}
		rear.next=newNode;
		rear=newNode;
		
	}
	
	public void dequeue() {
		if(front==null) {
			System.out.println("empty");
			return;
		}
		front=front.next;
		if(front==null) {
			rear=null;
		}	
	}
	
	public void display() {
		
		Node current=front;
		
		if(front==null) {
			System.out.println("empty Queue");
			return;
		}
		
		while (current !=null) {
		 System.out.println(current.data);
		 current=current.next;
		}
	}
	
	public static void main(String[] args) {
		Queue queue=new Queue();
		
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(5);
		
		queue.dequeue();
		queue.display();
	}
}
