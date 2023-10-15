package mandatoryHomeWork.week16;

public class DoubleLinkedListImplementation {
	
	Node head;
	Node tail;
	
	private int size=0;
	
	
	public void addFirst(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=tail=newNode;
		}else {
			newNode.next=head;
			newNode.prev=newNode;
			head=newNode;
		}
		size++;
	}
	
	public void addLast(int data) {
		Node newNode=new Node(data);
		if(tail==null) {
			head=tail=newNode;
		}else {
			tail.next=newNode;
			newNode.prev=tail;
			tail=newNode;
		}
		size++;
	}
	
	
	public void removeFirst() {
		if(head==null) {
			return;
		}if(head==tail) {
			head=tail=null;
		}else {
			  head = head.next;
		      head.prev = null;
		}
		size--;
	}
	
	
	public void removeLast() {
		if(tail==null) {
			return;
		}if(head==tail) {
			head=tail=null;
		}else {
			tail=tail.prev; //3
			tail.next=null; //
		}
		size--;
	}
	
	public int getSize() {
		return size;
	}
	
	public void displayNodes() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
	

}
