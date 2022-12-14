package singlyLinkedList;

public class singlyLinkedList {

	 class Node{
		 int data;
		 Node next;
		 
		 Node(int data){
			 this.data=data;
		 }
	 }
	 public Node head=null;
	 public Node tail=null;
	 
	 //adding
	 public void addNode(int data) {
		 Node newNode= new Node(data);
		
		 if( head == null) {
			 head = newNode;	  
		 }else {
			 tail.next= newNode;
		 }
		 tail = newNode;
	 }
	 
	 public void display() {
		if( head == null) {
			System.out.println("list is empty");
			return;
		}
		Node temp= head;
		while(temp != null){
			System.out.println(temp.data);
			temp = temp.next;	
		}
		
	 }
	 
	 //deleting
	 public void delete(int data) {
		 Node temp = head,prev=null;
		 if(temp != null && temp.data==data) {//head aanu delete aakunnath enkil headune adjacent nodilekk maatanam
			 head= temp.next;
			 return;
		 }
		 
		 while(temp != null && temp.data !=data) {
			 prev = temp;
			 temp = temp.next; 
		 }
		 
		 if(temp == null) {
			 return;
		 }
		 
		 if(temp == tail) {//tail aanu delete aavunnath enkil tail athin munpathe nodilekk maatanam
			 tail=prev;
			 tail.next= null;
			 return;
		 }
		 prev.next= temp.next; 
		 
		 
	 }
	 
	 public void inserAfter(int nextTo, int data) {
		 Node newNode= new Node(data);
		 Node temp = head;
		 
		 while(temp != null && temp.data !=nextTo) {
			 temp = temp.next;
		 }
		 
		 if(temp == null) {
			 return;
		 }
		 
		 if(temp == tail) {
			 tail.next = newNode;
			 tail = newNode;
			 return;
		 }
		 
		 newNode.next=temp.next;
		 temp.next= newNode;
		 
		 
	}
	 
	 public void sum() {
		 
		 int sumof=0;
		 Node temp=head;
		 
		 while(temp !=null) {
			 sumof=sumof+temp.data;
			 temp=temp.next;
		 }
		 System.out.println(sumof + "sum");
	 }
	 		
	 
	 public static void main(String[] args) {
		singlyLinkedList list = new singlyLinkedList();
		list.display();
		
		list.addNode(10);
		list.addNode(15);
		list.addNode(2);
		
//		list.delete(15);
		list.inserAfter(10, 35);
		
		list.display();
		list.sum();
	 }
}
