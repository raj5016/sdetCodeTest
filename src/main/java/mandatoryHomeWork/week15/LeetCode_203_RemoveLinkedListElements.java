package mandatoryHomeWork.week15;


public class LeetCode_203_RemoveLinkedListElements {
	
	public class ListNode{
		int val;
		ListNode next;
		
		ListNode() {
		}
		ListNode(int val){
			this.val=val;
		}
		ListNode(int val,ListNode next){
			this.val=val;
			this.next=next;
		}
	}
	
	 ListNode head;
	 ListNode tail;
	 
	 
	 //Add Node with int input
	 public void addNode(int data) {
		 if(head==null) {
			 tail=head=new ListNode(data);
		 }else {
			tail.next= new ListNode(data);
			tail=tail.next;
		 }
	 }
	 
	 // Add Data with Input array
	 public ListNode addNode(int[] datas) {
		 for (int data : datas) {
			addNode(data);
		}
		return head;
	 }
	 
	 // Display Nodes
	 public void displayNodes(ListNode node) {
		 ListNode current=node;
		 while(current!=null) {
			 System.out.print(current.val+" ");
			 current=current.next;
		 }
		 System.out.println();
	 }
	 
	 //remove given value from Linked List
	 
	public ListNode removeNode(ListNode head,int val) {
		 ListNode newHead = null;
		 ListNode newTail = null;

		    while (head != null) {
		        if (head.val != val) {
		            if (newHead == null) {
		                newHead = new ListNode(head.val);
		                newTail = newHead;
		            } else {
		                newTail.next = new ListNode(head.val);
		                newTail = newTail.next;
		            }
		        }
		        head = head.next;  //Incrementing to next node
		    }
		    return newHead;
	}
	

	public static void main(String[] args) {
		LeetCode_203_RemoveLinkedListElements object1=new LeetCode_203_RemoveLinkedListElements();
		
		//Remove node
		ListNode head=object1.removeNode(object1.addNode(new int[] {1,2,3,4,5}),3);
		System.out.println("Nodes after removing  from linked list:");
		object1.displayNodes(head);
	}

}
