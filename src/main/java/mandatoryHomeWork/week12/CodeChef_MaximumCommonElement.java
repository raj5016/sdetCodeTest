package mandatoryHomeWork.week12;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class CodeChef_MaximumCommonElement {
	
	/*
	 * 
	 * 
	 * 
	 * Given two arrays A and B, each of size N, where each array consists of distinct elements.
			
	   Find the number of elements that are common in both the arrays.
	   
	   Input 1: 1 2 3 4  , Input 2: 1 3 4 5
	   Output: 3
	   
	   Brutforce: 
	   
	   1.Sort the two arrays , initialize a variable maxCount=0
	   2.Iterate wit two loops and compare the element and if it matches increment the count.
	 */
	
	@Test
	public void test() {
		Assert.assertEquals(3, byBruteFoce_ReturnMaxCommonElement(new int[] {1,2,3,4}, new int[] {1,3,4,5}));
		Assert.assertEquals(3, byTwoPointer_ReturnMaxCommonElement(new int[] {1,2,3,4}, new int[] {1,3,4,5}));
	}
	
	@Test
	public void test1() {
		Assert.assertEquals(0, byBruteFoce_ReturnMaxCommonElement(new int[] {1,2,3,4}, new int[] {8,9,10,5}));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(3, byBruteFoce_ReturnMaxCommonElement(new int[] {2,4,1}, new int[] {1,4,2}));
	}
	
	
	public int byBruteFoce_ReturnMaxCommonElement(int[] input1,int[] input2) { //1 2 3 4 ---- 1 3 4 5
		int maxCount=0;
		Arrays.sort(input1);
		Arrays.sort(input2);
		for (int i = 0; i < input1.length; i++) {
			for (int j = 0; j < input2.length; j++) {
				if(input1[i]==input2[j]) {
					maxCount++;
				}
			}
		}
		return maxCount;
	}
	
	
	public int byTwoPointer_ReturnMaxCommonElement(int[] input1,int[] input2) {
		int maxCount=0;
		Arrays.sort(input1);
		Arrays.sort(input2);
		int i=0,j=0;
		while(i<input1.length&& j<input2.length) {
			System.out.println(input1[i]);
			System.out.println(input2[j]);
			if(input1[i]==input2[j]) {
				maxCount++;
				i++;
				j++;
			}else if(input1[i]<input1[j]) {
				j++;
			}else {
				i++;
			}
			
		}
		return maxCount;
	}

}
