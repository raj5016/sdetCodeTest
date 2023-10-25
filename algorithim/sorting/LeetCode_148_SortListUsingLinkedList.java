package mandatoryHomeWork.week17;

import org.junit.Test;

import mandatoryHomeWork.week15.ListNode;
import mandatoryHomeWork.week15.SingleLinkedListImplementations;

public class LeetCode_148_SortListUsingLinkedList {
	
	@Test
	public void test() {
		SingleLinkedListImplementations obj1 = new SingleLinkedListImplementations();
		ListNode head = sortList(obj1.addNode(new int[] {4,2,1,3}));
		System.out.println("Sorted linked list:");
		obj1.displayNodes(head);
	}
	
	
	public ListNode sortList(ListNode head) {
	    if (head == null || head.next == null) {
	        return head;
	    }

	    // Find the middle of the linked list
	    ListNode mid = findMiddle(head);

	    // Split the linked list into two halves
	    ListNode left = head;
	    ListNode right = mid.next;
	    mid.next = null;

	    // Recursively sort the two halves
	    left = sortList(left);
	    right = sortList(right);

	    // Merge the sorted halves
	    return merge(left, right);
	}

	private ListNode findMiddle(ListNode head) {
	    ListNode slow = head;
	    ListNode fast = head;

	    while (fast.next != null && fast.next.next != null) {
	        slow = slow.next;
	        fast = fast.next.next;
	    }

	    return slow;
	}
	
	private ListNode merge(ListNode left, ListNode right) {
	    ListNode dummy = new ListNode(0);
	    ListNode current = dummy;

	    while (left != null && right != null) {
	        if (left.val < right.val) {
	            current.next = left;
	            left = left.next;
	        } else {
	            current.next = right;
	            right = right.next;
	        }
	        current = current.next;
	    }

	    if (left != null) {
	        current.next = left;
	    }
	    if (right != null) {
	        current.next = right;
	    }

	    return dummy.next;
	}

}
