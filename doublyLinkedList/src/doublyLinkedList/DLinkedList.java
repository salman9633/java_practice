package doublyLinkedList;

	public class DLinkedList {
		class Node{
			int data;
			Node next;
			Node prev;
			
			Node(int data){
				this.data= data;
			}
		}
		
		public Node head;
		public Node tail;
		
		public void addNode(int data) {
			Node newNode= new Node(data);
			
			if(head == null) {
				head= newNode;
			}else {
				tail.next=newNode;
				newNode.prev=tail;
			}
			
			tail=newNode;
		}
		
		public void displayfrwd() {
			Node temp = head;
			
			while(temp != null) {
				System.out.println(temp.data);
				temp= temp.next;
			}
		}
		
		public void displayReverse() {
			Node temp= tail;
			
			while(temp !=null) {
				System.out.println(temp.data);
				temp=temp.prev;
			}
			
		}
		public static void main(String[] args) {
			DLinkedList list= new DLinkedList();
			
			
			list.addNode(1);
			list.addNode(10);
			list.addNode(100);
			list.addNode(1000);
			list.addNode(10000);
			list.displayfrwd();
			list.displayReverse();
		}
		
		
}
