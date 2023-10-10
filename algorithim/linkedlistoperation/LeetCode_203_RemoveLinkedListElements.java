package mandatoryHomeWork.week15;

import org.junit.Test;

public class LeetCode_203_RemoveLinkedListElements {
	//https://leetcode.com/problems/remove-linked-list-elements/
	
	
	@Test
	public void test() {
		SingleLinkedListImplementations obj1 = new SingleLinkedListImplementations();
		ListNode head = removeNode(obj1.addNode(new int[] {1,2,3,4,5}),3);
		System.out.println("Nodes after removing  from linked list:");
		obj1.displayNodes(head);
	}

	 //remove given value from Linked List
	 
	public ListNode removeNode(ListNode head,int val) {
		 ListNode newHead = null;
		 ListNode newTail = null;
		    while (head != null) {
		        if (head.data != val) {
		            if (newHead == null) {
		                newHead = new ListNode(head.data);
		                newTail = newHead;
		            } else {
		                newTail.next = new ListNode(head.data);
		                newTail = newTail.next;
		            }
		        }
		        head = head.next;  //Incrementing to next node
		    }
		    return newHead;
	}
	
}
