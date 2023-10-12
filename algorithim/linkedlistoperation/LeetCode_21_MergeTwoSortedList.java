package mandatoryHomeWork.week15;

import org.junit.Test;

public class LeetCode_21_MergeTwoSortedList {
	
	//https://leetcode.com/problems/merge-two-sorted-lists/description/

	@Test
	public void test() {
		SingleLinkedListImplementations obj1 = new SingleLinkedListImplementations();
		  ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
	      ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
		ListNode head = mergeTwoLists(list1,list2);
		System.out.println("Merged node list:");
		obj1.displayNodes(head);
	}
	
	 public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		 if(list1==null && list2==null) {
			 return null;
		 }
		 ListNode current1=list1;
		 ListNode current2=list2;
		 ListNode newHead=new ListNode(0);
		 ListNode temp=newHead;
		 
		while(current1!=null && current2!=null) {
			if(current1.val<=current2.val) {
				temp.next=current1;
				current1=current1.next;
			}else {
				temp.next=current2;
				current2=current2.next;
			}
			temp=temp.next;
		}
		 if(current1==null) {
			temp.next= current2;
		 }else {
			 temp.next=current1;
		 }
		 return newHead.next;
	   }
}
