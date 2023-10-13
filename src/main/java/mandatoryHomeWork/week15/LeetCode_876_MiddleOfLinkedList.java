package mandatoryHomeWork.week15;

import org.junit.Test;

public class LeetCode_876_MiddleOfLinkedList {

	// https://leetcode.com/problems/middle-of-the-linked-list/

	@Test
	public void test() {
		SingleLinkedListImplementations obj1 = new SingleLinkedListImplementations();
		ListNode head = middleNode(obj1.addNode(new int[] { 1, 2, 3, 4 }));
		System.out.println("Node from middle list:");
		obj1.displayNodes(head);
	}
	
	@Test
	public void test1() {
		SingleLinkedListImplementations obj1 = new SingleLinkedListImplementations();//object creation
		ListNode head = middleNode(obj1.addNode(new int[] {1,2,3,4,5,6}));
		System.out.println("Node from middle list:");
		obj1.displayNodes(head);
	}

	public ListNode middleNode(ListNode head) {
		if (head == null) {
			return null; // Return null if the list is empty
		}

		ListNode current = head;
		int count = 0;

		// First pass: Count the number of nodes in the list
		while (current != null) {
			count++;
			current = current.next;
		}

		current = head;
		int middle = count / 2;

		// Second pass: Traverse to the middle node
		for (int i = 0; i < middle; i++) {
			current = current.next;
		}

		return current;
	}

}
