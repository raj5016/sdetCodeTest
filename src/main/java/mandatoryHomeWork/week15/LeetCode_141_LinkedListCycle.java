package mandatoryHomeWork.week15;

import java.util.HashSet;

import org.junit.Test;
import org.testng.Assert;

public class LeetCode_141_LinkedListCycle {
	
	//https://leetcode.com/problems/linked-list-cycle/description/
	
	SingleLinkedListImplementations obj=new SingleLinkedListImplementations();
	
	@Test
	public void test() {
		ListNode head=obj.addNode(new int[] {3,2,0,-4});
		obj.displayNodes(head);
		Assert.assertEquals(true, hasCycle(obj.createCycleWithRandomPosition(head)));
	}
	
	 public boolean hasCycle(ListNode head) {
		 HashSet<ListNode>  hset=new HashSet<ListNode>();
		 ListNode currentNode=head;
		 
		 while(currentNode!=null) {
			 if(hset.contains(currentNode)) {
				 return true;
			 }
			 hset.add(currentNode);
			 currentNode=currentNode.next;
		 }
		 
		return false;
	        
	  }

}
