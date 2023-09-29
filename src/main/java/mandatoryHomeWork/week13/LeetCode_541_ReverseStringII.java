package mandatoryHomeWork.week13;

import org.junit.Test;
import org.testng.Assert;

public class LeetCode_541_ReverseStringII {
	
	/*https://leetcode.com/problems/reverse-string-ii/
	 * 
	 * Logic:
	 * 
	 * Define variable i and length of string n
	 * Convert string to tochar array
	 * Have a condition to iterate until length of string
	 * 		Find minimum of (i + k - 1) and (n - 1) and assign to j variable
	 * 		Call reverse method and swap the char array 
	 * 		And assign the i with i + 2 * k
	 * Convert the char to string and return it.
	 */
	
	@Test
	public void test() {
		Assert.assertEquals("bacdfeg", returnFinalReverseString("abcdefg", 2));
	}
	
	public String returnFinalReverseString(String s,int k) {  //abcdefg
		int i=0;
		int n=s.length();
		char[] c=s.toCharArray();
		
		while(i<n) {
			int j=Math.min(i+k-1, n-1);    // 1st iteration -if k=2, then j= (0+2-1,6) so j=1,
			reverseString(c, i, j);
			i=i+2*k;
		}
	    String str=new String(c);

		return str;
	}
	
	
	public  void reverseString(char[] arr, int i, int j){
		  while(i<j){
		        char temp=arr[i];
		        arr[i]=arr[j];
		        arr[j]=temp;
		        i++;
		        j--;
		    }
	}
	
}
