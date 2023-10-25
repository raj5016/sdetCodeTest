package mandatoryHomeWork.week15;

import org.junit.Test;

public class LeetCode_2095_DeleteTheMiddleNodeOfALinkedList {
	//https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/description/
	
	@Test
	public void test() {
		SingleLinkedListImplementations obj1 = new SingleLinkedListImplementations();
		ListNode head = deleteMiddle(obj1.addNode(new int[] {1,3,4,7,1,2,6}));
		System.out.println("Nodes after removing  middle node from linked list:");
		obj1.displayNodes(head);
	}
	
	 public ListNode deleteMiddle(ListNode head) {
		 
		 if(head==null || head.next==null) {
			 return null;
		 }
		 ListNode slow=head;
		 ListNode fast=head;
		 ListNode p=null;
		 
		 while(fast!=null && fast.next!=null) {
			 p=slow;
			 slow=slow.next;
			 fast=fast.next.next;
		 }
		 p.next=p.next.next;
		return head;
	}

}
