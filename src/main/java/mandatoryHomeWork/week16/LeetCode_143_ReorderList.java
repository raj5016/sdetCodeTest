package mandatoryHomeWork.week16;

import org.junit.Test;

import mandatoryHomeWork.week15.ListNode;
import mandatoryHomeWork.week15.SingleLinkedListImplementations;

public class LeetCode_143_ReorderList {
	
	
	@Test
	public void test1() {
		SingleLinkedListImplementations obj1 = new SingleLinkedListImplementations();//object creation
		reorderList(obj1.addNode(new int[] {1,2,3,4,5,6}));
	}
	
	
	//https://leetcode.com/problems/reorder-list/description/
	public void reorderList(ListNode head) {

		if (head == null && (head.next == null || head.next.next == null)) {
			return;
		}

		// find middle element
		ListNode slow = head;
		ListNode fast = head.next;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		// reverse the second half of the list starting from the middle
		ListNode prev = null;

		while (slow != null) {
			ListNode temp = slow.next;
			slow.next = prev;
			prev = slow;
			slow = temp;
		}

		// Merge two halves
		ListNode p1 = head;
		ListNode p2 = prev;

		while (p1 != null) {
			ListNode next1 = p1.next;
			ListNode next2 = p2.next;
			p1.next = p2;
			p2.next = next1;
			p1 = next1;
			p2 = next2;
		}
	}

}
