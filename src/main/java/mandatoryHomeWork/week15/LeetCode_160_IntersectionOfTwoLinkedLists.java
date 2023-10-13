package mandatoryHomeWork.week15;


public class LeetCode_160_IntersectionOfTwoLinkedLists {
	
	//https://leetcode.com/problems/intersection-of-two-linked-lists/
	
	
	 public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	        if (headA == null || headB == null) {
	            return null; // No intersection if either list is empty
	        }
	        
	        ListNode pointerA = headA;
	        ListNode pointerB = headB;
	        
	        while (pointerA != pointerB) {
	            // Advance the pointers, and if they reach the end of their lists, move to the other list.
	            pointerA = (pointerA == null) ? headB : pointerA.next;
	            pointerB = (pointerB == null) ? headA : pointerB.next;
	        }
	        
	        return pointerA; // Return the intersection point, or null if there is none.
	    }
	 
	 
	 //============================2nd Approach================================================================
	 
	 public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
	        if(headA == null || headB == null) return null;
	        ListNode curr1 = headA;
	        ListNode curr2 = headB;
	        while(curr1!=curr2){
	            if(curr1==null){
	                curr1=headA;
	            }
	            else{
	                curr1=curr1.next;
	            }
	            if(curr2==null){
	                curr2=headB;
	            }
	            else{
	                curr2=curr2.next;
	            }
	        }
	        return curr1;
	    }
}

