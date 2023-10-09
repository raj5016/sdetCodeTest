package mandatoryHomeWork.week15;

public class LeetCode_206_ReverseLinkedList {

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
	
	public ListNode head;
	public ListNode tail;
	private int size;
	
	// add Nodes:
	public void addNode(int data) {
		if(head==null) {
			tail=head=new ListNode(data);
		}else {
			tail.next=new ListNode(data);
			tail=tail.next;
		}
		size++;
	}
	
	//Add node by int array
	public ListNode addNodes(int[] value) {
		for (int each : value)
			addNode(each);
		return head;
	}

	// Display nodes
	public void displayNodes(ListNode node) {
	    ListNode current = node;
	    while (current != null) {
	        System.out.print(current.val + " ");
	        current = current.next;
	    }
	    System.out.println();
	}
	
	//Reverse node by Nataraj using paramatersized constructor
	public ListNode reverseNode(ListNode head) {
		if(head==null) return null;
		if(head.next==null) return head;
		
        ListNode currentHead = null;

		while(head!=null) {
			currentHead=new ListNode(head.val,currentHead);
			head = head.next;
		}
		return currentHead;
	}

	
	public static void main(String[] args) {
		LeetCode_206_ReverseLinkedList object1=new LeetCode_206_ReverseLinkedList();
		
		//4. ReverseNode by Nataraj
		ListNode head=object1.reverseNode(object1.addNodes( new int[] {1,2,3,4,5}));
		System.out.println("Reversed linked list:");
		object1.displayNodes(head);
	}

	
}
