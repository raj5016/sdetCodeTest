package mandatoryHomeWork.week15;

import org.junit.Test;


public class LeetCode_206_ReverseLinkedList {
	
	//https://leetcode.com/problems/reverse-linked-list/
	@Test
	public void test() {
		SingleLinkedListImplementations obj1 = new SingleLinkedListImplementations();
		ListNode head = reverseNode(obj1.addNode(new int[] { 1, 2, 3, 4 }));
		System.out.println("Reversed linked list:");
		obj1.displayNodes(head);
	}
	
	//Reverse node by Nataraj using paramatersized constructor
	public ListNode reverseNode(ListNode head) {
		if(head==null) return null;
		if(head.next==null) return head;
		
        ListNode currentHead = null;

		while(head!=null) {
			currentHead=new ListNode(head.data,currentHead);
			head = head.next;
		}
		return currentHead;
	}

}
