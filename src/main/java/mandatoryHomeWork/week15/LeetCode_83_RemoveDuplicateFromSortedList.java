package mandatoryHomeWork.week15;

import org.junit.Test;

public class LeetCode_83_RemoveDuplicateFromSortedList {
	
	//https://leetcode.com/problems/remove-duplicates-from-sorted-list/
	@Test
	public void test() {
		SingleLinkedListImplementations obj1 = new SingleLinkedListImplementations();
		ListNode head = deleteDuplicates(obj1.addNode(new int[] {1,1,2,3,3}));
		System.out.println("Nodes after removing  duplicate from linked list:");
		obj1.displayNodes(head);
	}
	
	 public ListNode deleteDuplicates(ListNode head) {
		 ListNode current = head;
		    while (current != null && current.next!=null) {
		    	 if (current.val == current.next.val) { //Skip the duplicate node
		    		 current.next = current.next.next;
		    	 }else {
		    		 current = current.next;// Move to the next node
		    	 }
		    }
		    return head;
	 }
		

}
