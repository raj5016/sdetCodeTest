package mandatoryHomeWork.week15;

import org.junit.Test;

public class LeetCode_61_RotateList {
	
	//https://leetcode.com/problems/rotate-list/
	 SingleLinkedListImplementations obj=new SingleLinkedListImplementations();
	 
	 @Test
		public void test() {
			ListNode head = rotateRight(obj.addNode(new int[] {1,2,3,4,5}),2);
			System.out.println("Nodes after rotating for k times:");
			obj.displayNodes(head);
		}

	public ListNode rotateRight(ListNode head, int k) {

		if (head == null || k == 0) {
			return head;
		}

		// 1.find the length of given node
		int length = 1;
        ListNode tail = head;
        
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }	
        
		//2. Calculate the effective rotation amount.
		k = k % length;
		
		if (k == 0) {
			return head;
		}

		// 3.Find the new head and new tail.
		ListNode newTail = head;
		for (int i = 0; i < length - k - 1; i++) {
			newTail = newTail.next;
		}

		// 4.Perform the rotation.
		ListNode newHead = newTail.next;
		newTail.next = null;
		tail.next = head;

		return newHead;
	}   
	        
	 }

