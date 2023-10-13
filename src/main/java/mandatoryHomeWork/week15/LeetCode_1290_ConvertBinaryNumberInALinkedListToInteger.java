package mandatoryHomeWork.week15;

import org.junit.Test;
import org.testng.Assert;

public class LeetCode_1290_ConvertBinaryNumberInALinkedListToInteger {

	//https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
	
	/*Logic:
	 * We initialize decimalValue to 0, which will store the result.
	 * We iterate through the linked list, and for each node:
	 * 			We shift decimalValue left by 1 (which is equivalent to multiplying it by 2)
	 * 										 using the bitwise left shift operator (<<).
	 * 			We then use the bitwise OR (|) operation to add the value of the current node (0 or 1) to decimalValue
	 * 			Finally, we move to the next node in the list.
	 * After the loop, decimalValue will contain the decimal representation of the binary number, 
	 * 
	 */
	
	@Test
	public void test() {
		SingleLinkedListImplementations obj1 = new SingleLinkedListImplementations();
		Assert.assertEquals(5,  getDecimalValue(obj1.addNode(new int[] {1,0,1})));
	}
	@Test
	public void test1() {
		SingleLinkedListImplementations obj1 = new SingleLinkedListImplementations();
		Assert.assertEquals(0,  getDecimalValue(obj1.addNode(new int[] {0})));
	}
	
	  public int getDecimalValue(ListNode head) {
	        int decimalValue = 0;
	        
	        while (head != null) {
	            decimalValue = (decimalValue << 1) | head.val;
	            head = head.next;
	        }
	        
	        return decimalValue;
	    }
}
